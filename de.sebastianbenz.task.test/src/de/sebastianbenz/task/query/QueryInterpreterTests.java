package de.sebastianbenz.task.query;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.QueryStandaloneSetup;
import de.sebastianbenz.task.util.AbstractTest;

public class QueryInterpreterTests extends AbstractTest {

	@BeforeClass
	public static void init() {
		QueryStandaloneSetup.doSetup();
	}

	private String result;

	
	@Inject
	private QueryInterpreter fixture;

	@Test
	public void shouldSelectAllTasksForTag() {
		model("- task1 @done\n", "- task2\n");

		select("@done");

		assertThat(result, is("task1"));
	}
	
	@Test
	public void shouldSupportAndExpressions() {
		model(  "- task1 @a @b \n",
				"- task2 @a\n",
				"- task3 @b\n",
				"- task4\n");

		select("@a and @b");

		assertThat(result, is("task1"));
	}
	
	
	@Test
	public void shouldSupportOrExpressions() {
		model(  "- task1 @a @b \n",
				"- task2 @a\n",
				"- task3 @b\n",
				"- task4\n");

		select("@a or @b");

		assertThat(result, is("task1, task2, task3"));
	}

	
	@Test
	public void shouldSupportNotExpression() throws Exception {
		model("- task1 @done\n", "- task2\n");

		select("not @done");

		assertThat(result, is("task2"));
	}
	
	@Test
	public void shouldFilterEmptyProjects() throws Exception {
		model("project1:\n" +
				" - task1 @done\n", 
			  "project2:\n" +
				" - task2\n");

		select("@done");

		assertThat(result, is("project1, task1"));
	}
	
	@Test
	public void shouldFilterEmptyProjectsRecursively() throws Exception {
		model("project1:\n" +
				" project1_1:\n" +
				"  - task1 @done\n", 
			  "project2:\n" +
				" - task2\n");

		select("@done");

		assertThat(result, is("project1, project1_1, task1"));
	}
	
	@Test
	public void shouldFilterProjects() throws Exception {
		model("project1:\n" +
				" - task1\n", 
			  "project2:\n" +
				" - task2\n");

		select("project: project1");

		assertThat(result, is("project1, task1"));
	}
	

	@Test
	public void shouldFilterProjects2() throws Exception {
		model("project1:\n" +
				" project1_1:\n" +
				"  - task1\n"); 

		select("project: project1");

		assertThat(result, is("project1, project1_1, task1"));
	}
	
	@Test
	public void shouldExecuteQueriesWithinProjectScope() throws Exception {
		model("project:\n" +
			"	project1:\n" + 
			"		shouldNotBeSelected\n" +
			"	project2:\n" + 
			"		shouldBeSelected\n" +
			"		shouldNotBeSelected @done\n");
		select("project:project2 and not @done");
		assertThat(result, is("project, project2, shouldBeSelected"));
	}
	
	
	@Test
	public void shouldFilterTasks() throws Exception {
		model("project1:\n" +
				" - task1\n", 
			  "project2:\n" +
				" task1\n");

		select("task : task1");

		assertThat(result, is("project1, task1"));
	}
	
	@Test
	public void shouldFilterText() throws Exception {
		model("project1:\n" +
				" - task1\n", 
			  "project2:\n" +
				" task1\n");

		select("text : task1");

		assertThat(result, is("project2, task1"));
	}
	
	@Test
	public void shouldFilterByProjectAndTag() throws Exception {
		model("project1:\n" +
				" - task11 @done\n" +
				" - task12 \n",
			  "project2:\n" +
				" - task21 @done\n" +
				" - task22 \n"); 

		select("project : project1 and @done");

		assertThat(result, is("project1, task11"));
	}
	
	@Test
	public void shouldFilterNotes() throws Exception {
		model("project1:\n" +
				" note1\n",
			  "project2:\n" +
				" note2\n"); 

		select("project : project1");

		assertThat(result, is("project1, note1"));
	}
	

	@Test
	public void shouldSupportEqual() throws Exception {
		model(  "- task1 @prio(1)\n" +
				"- task2 @prio(2)\n"); 

		select("@prio = 1");
		assertThat(result, is("task1"));
		
		select("@prio != 1");
		assertThat(result, is("task2"));
	}
	
	@Test
	public void shouldSupportEqual2() throws Exception {
		model(  "- task1 @prio(hello)\n" +
				"- task2 @prio(world)\n"); 
		
		select("@prio = hello");
		assertThat(result, is("task1"));
		
		select("@prio = 'hello'");
		assertThat(result, is("task1"));
	}
	
	@Test
	public void shouldSupportLessGreaterThan() throws Exception {
		model(  "- task1 @prio(1)\n" +
				"- task2 @prio(2)\n" +
				"- task3 @prio(3)\n"); 

		select("@prio < 2");
		assertThat(result, is("task1"));
		
		select("@prio > 2");
		assertThat(result, is("task3"));
		
		select("@prio >= 2");
		assertThat(result, is("task2, task3"));
		
		select("@prio <= 2");
		assertThat(result, is("task1, task2"));
		
		select("@prio <= 2.1");
		assertThat(result, is("task1, task2"));
	}
	
	@Test
	public void shouldSupportLessGreaterThanOnStrings() throws Exception {
		model(  "- task1 @version(1.0.0)\n" +
				"- task2 @version(1.0.1)\n" +
				"- task3 @version(1.1.0)\n"); 

		select("@version < 1.0.1");
		assertThat(result, is("task1"));
		
		select("@version > 1.0.1");
		assertThat(result, is("task3"));
		
		select("@version >= 1.0.1");
		assertThat(result, is("task2, task3"));
		
		select("@version <= 1.0.1");
		assertThat(result, is("task1, task2"));
		
		select("@version <= 1.0.1");
		assertThat(result, is("task1, task2"));
	}
	
	@Test
	public void shouldSupportSelectingWordInContent() throws Exception {
		model(  "- task hello @prio(1)\n" +
				"- task world @prio(1)\n" +
				"note hello\n" +
				"note world\n" +
				"project hello:\n"+
				"project world:\n"); 

		select("hello");
		assertThat(result, is("task hello, note hello, project hello"));
	}
	
	@Test
	public void shouldSupportSelectingMultipleWordsInContent() throws Exception {
		model(  "- task hello aaa world @prio(1)\n" +
				"- task aaaa @prio(1)\n" +
				"note hello aaa world \n" +
				"note world\n" +
				"project hello aaa world:\n"+
				"project world:\n"); 

		select("hello world");
		assertThat(result, is("task hello aaa world, note hello aaa world, project hello aaa world"));
	}
	
	@Test
	public void shouldSupportSelectingPhrases() throws Exception {
		model(  "- task hello world @prio(1)\n" +
				"- task hello a world @prio(1)\n" +
				"note hello world \n" +
				"note hello a world\n" +
				"project hello world:\n"+
				"project hello a world:\n"); 

		select("'hello world'");
		assertThat(result, is("task hello world, note hello world, project hello world"));
	}
	
	@Test
	public void shouldSupportNestedTasks() throws Exception {
		model(  "- task2\n"+
				"	- task21\n" + 
				"		- task211\n"); 

		select("task211");
		assertThat(result, is("task2, task21, task211"));
	}
	
	private void select(String queryString) {
		Query query = query(queryString);

		List<String> results = newArrayList();
		for (Content content : allInstancesOf(Content.class)) {
			if (fixture.select(query, content)){
				results.add(content.getValue().toString());
			}
		}

		result = Joiner.on(", ").join(results);
	}

	protected Query query(String queryString) {
		Resource resource = resource(queryString, "__query");
		Query query = (Query) resource.getContents().get(0);
		return query;
	}

	private void model(String... taskModels) {
		for (String string : taskModels) {
			System.out.println(string);
			parse(string);
		}
	}

}
