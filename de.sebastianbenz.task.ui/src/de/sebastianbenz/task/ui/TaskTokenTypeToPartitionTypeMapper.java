package de.sebastianbenz.task.ui;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;

import com.google.inject.Singleton;

@Singleton
public class TaskTokenTypeToPartitionTypeMapper extends TerminalsTokenTypeToPartitionMapper{

	public static final String CODE_PARTITION = "__code";
	
	protected static final String[] SUPPORTED_PARTITIONS = new String[]{
		COMMENT_PARTITION,
		SL_COMMENT_PARTITION,
		STRING_LITERAL_PARTITION,
		IDocument.DEFAULT_CONTENT_TYPE,
		CODE_PARTITION
	};

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_CODE_".equals(tokenName)) {
			return CODE_PARTITION;
		} 
		return super.calculateId(tokenName, tokenType);
	}
	
	@Override
	public String[] getSupportedPartitionTypes() {
		return SUPPORTED_PARTITIONS;
	}
	
}
