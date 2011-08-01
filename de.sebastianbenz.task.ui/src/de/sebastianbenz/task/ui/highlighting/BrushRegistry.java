package de.sebastianbenz.task.ui.highlighting;

import static com.google.common.collect.Maps.newHashMap;
import static de.sebastianbenz.task.ui.highlighting.Brush.Mapping.pattern;
import static de.sebastianbenz.task.ui.highlighting.BrushBuilder.lang;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.CODE_ANNOTATION_ID;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.*;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.COMMENT_ID;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.NUMBER_ID;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.STRING_ID;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import com.google.inject.Singleton;

@Singleton
public class BrushRegistry {
	
	private static final Pattern PERL_SINGLE_LINE_COMMENT = Pattern.compile("#.*$", Pattern.MULTILINE);
	public static final String DEFAULT_CONFIGURATION = "default";
	public static final Pattern MULTILINE_LINE_COMMENT = Pattern.compile("/\\*[\\s\\S]*?\\*/", Pattern.MULTILINE);
	public static final Pattern SINGLE_LINE_COMMENT = Pattern.compile("//.*$", Pattern.MULTILINE);
	public static final Pattern DOUBLE_QUOTED_STRING = Pattern.compile("\"(?:\\.|(\\\\\\\")|[^\\\"\"\\n])*\"");
	public static final Pattern SINGLE_QUOTED_STRING = Pattern.compile("'(?:\\.|(\\\\\\')|[^\\''\\n])*'");
	
	private Map<String, Brush> configurations = newHashMap();
	
	public BrushRegistry() {
		init();
	}
	
	protected void init(){
		register(
		    lang(DEFAULT_CONFIGURATION)
				.mapping(
					pattern(MULTILINE_LINE_COMMENT).style(COMMENT_ID),
					pattern(SINGLE_LINE_COMMENT).style(COMMENT_ID),
					pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
					pattern(SINGLE_QUOTED_STRING).style(STRING_ID),
					pattern("\\b([\\d]+(\\.[\\d]+)?|0x[a-f0-9]+)\\b").style(NUMBER_ID),
					pattern("(?!\\@interface\\b)\\@[\\$\\w]+\\b").style(CODE_ANNOTATION_ID)
				),
			// Copyright Alex Gorbatchev
			lang("java")
				.keywords(  "abstract assert boolean break byte case catch char class const " +
			                "continue default do double else enum extends " +
			                "false final finally float for goto if implements import " +
			                "instanceof int interface long native new null " +
			                "package private protected public return " +
			                "short static strictfp super switch synchronized this throw throws true " +
			                "transient try void volatile while")
				.mapping(
					pattern(MULTILINE_LINE_COMMENT).style(COMMENT_ID),
					pattern(SINGLE_LINE_COMMENT).style(COMMENT_ID),
					pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
					pattern(SINGLE_QUOTED_STRING).style(STRING_ID),
					
					pattern("\\b([\\d]+(\\.[\\d]+)?|0x[a-f0-9]+)\\b").style(NUMBER_ID),
					pattern("(?!\\@interface\\b)\\@[\\$\\w]+\\b").style(CODE_ANNOTATION_ID)),
			// copyright Alex Gorbatchev
			lang("js", "javascript")
				.keywords(  "break case catch continue " +
	                        "default delete do else false " +
	                        "for function if in instanceof " +
	                        "new null return super switch " +
	                        "this throw true try typeof var while with")
				.mapping(
					pattern(MULTILINE_LINE_COMMENT).style(COMMENT_ID),
					pattern(SINGLE_LINE_COMMENT).style(COMMENT_ID),
					pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
					pattern(SINGLE_QUOTED_STRING).style(STRING_ID),
					pattern("\\s*#.*").style(CODE_ANNOTATION_ID),
					pattern("\\b([\\d]+(\\.[\\d]+)?|0x[a-f0-9]+)\\b").style(NUMBER_ID)),
					
			lang("xml", "html", "xhtml", "xslt")
				.mapping(
					pattern("<\\?.*\\?>").style(CODE_ANNOTATION_ID),
					pattern("</?[a-zA-Z-]*").style(COMMENT_ID),
					pattern("(/>|>)").style(COMMENT_ID),
					pattern("(<!--.*-->)").style(STRING_ID),
					pattern("\\s(\\w*)\\=").style(HighlightingConfiguration.KEYWORD_ID),
					pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
					pattern(SINGLE_QUOTED_STRING).style(STRING_ID)
				),
			// Copyright Alex Gorbatchev
			lang("scala")
				.keywords("val sealed case def true trait implicit forSome import match object null finally super " +
                        "override try lazy for var catch throw type extends class while with new final yield abstract " +
                        "else do if return protected private this package false")
				.mapping(
					pattern(MULTILINE_LINE_COMMENT).style(COMMENT_ID),
					pattern(SINGLE_LINE_COMMENT).style(COMMENT_ID),
					pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
					pattern(SINGLE_QUOTED_STRING).style(STRING_ID),
					pattern("\\b([\\d]+(\\.[\\d]+)?|0x[a-f0-9]+)\\b").style(NUMBER_ID)
				),
			// Copyright Erik Peterson.
			lang("ruby")
				.keywords("alias and BEGIN begin break case class def define_method defined do each else elsif " +
                        "END end ensure false for if in module new next nil not or raise redo rescue retry return " +
                        "self super then throw true undef unless until when while yield " +
						// builtins
						"Array Bignum Binding Class Continuation Dir Exception FalseClass File::Stat File Fixnum Fload " +
                        "Hash Integer IO MatchData Method Module NilClass Numeric Object Proc Range Regexp String Struct::TMS Symbol " +
                        "ThreadGroup Thread Time TrueClass")
				.mapping(
						pattern(PERL_SINGLE_LINE_COMMENT).style(COMMENT_ID),
						pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
						pattern(SINGLE_QUOTED_STRING).style(STRING_ID),
						pattern("(\\$|@@|@)\\w+").style(KEYWORD_ID),
						pattern(":[a-z][A-Za-z0-9_]*").style(KEYWORD_ID), // symbols
						pattern("\b[A-Z0-9_]+\b").style(KEYWORD_ID) // constants
				),
			// Copyright Alex Gorbatchev
			lang("py", "python")
				.keywords(
						"and assert break class continue def del elif else " +
                        "except exec finally for from global if import in is " +
                        "lambda not or pass print raise return try yield while " +
						// functions
						"__import__ abs all any apply basestring bin bool buffer callable " +
		                "chr classmethod cmp coerce compile complex delattr dict dir " +
		                "divmod enumerate eval execfile file filter float format frozenset " +
		                "getattr globals hasattr hash help hex id input int intern " +
		                "isinstance issubclass iter len list locals long map max min next " +
		                "object oct open ord pow print property range raw_input reduce " +
		                "reload repr reversed round set setattr slice sorted staticmethod " +
		                "str sum super tuple type type unichr unicode vars xrange zip " +
						// special
						"None True False self cls class_"
				)
				.mapping(
						pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
						pattern(PERL_SINGLE_LINE_COMMENT).style(COMMENT_ID),
						pattern("^\\s*@\\w+").style(CODE_ANNOTATION_ID),
						pattern(Pattern.compile("\"(?!\")(?:\\.|\\\"|[^\"\"\n])*\"", Pattern.MULTILINE)).style(STRING_ID),
						pattern(Pattern.compile("'(?!')(?:\\.|(\\\')|[^\''\n])*'", Pattern.MULTILINE)).style(STRING_ID),
						
						pattern("\\b([\\d]+(\\.[\\d]+)?|0x[a-f0-9]+)\\b").style(NUMBER_ID))
			,
			// Copyright 2006 Shin, YoungJin
			lang("cpp", "c")
				.keywords(	// datatypes
						"ATOM BOOL BOOLEAN BYTE CHAR COLORREF DWORD DWORDLONG DWORD_PTR " +
                        "DWORD32 DWORD64 FLOAT HACCEL HALF_PTR HANDLE HBITMAP HBRUSH " +
                        "HCOLORSPACE HCONV HCONVLIST HCURSOR HDC HDDEDATA HDESK HDROP HDWP " +
                        "HENHMETAFILE HFILE HFONT HGDIOBJ HGLOBAL HHOOK HICON HINSTANCE HKEY " +
                        "HKL HLOCAL HMENU HMETAFILE HMODULE HMONITOR HPALETTE HPEN HRESULT " +
                        "HRGN HRSRC HSZ HWINSTA HWND INT INT_PTR INT32 INT64 LANGID LCID LCTYPE " +
                        "LGRPID LONG LONGLONG LONG_PTR LONG32 LONG64 LPARAM LPBOOL LPBYTE LPCOLORREF " +
                        "LPCSTR LPCTSTR LPCVOID LPCWSTR LPDWORD LPHANDLE LPINT LPLONG LPSTR LPTSTR " +
                        "LPVOID LPWORD LPWSTR LRESULT PBOOL PBOOLEAN PBYTE PCHAR PCSTR PCTSTR PCWSTR " +
                        "PDWORDLONG PDWORD_PTR PDWORD32 PDWORD64 PFLOAT PHALF_PTR PHANDLE PHKEY PINT " +
                        "PINT_PTR PINT32 PINT64 PLCID PLONG PLONGLONG PLONG_PTR PLONG32 PLONG64 POINTER_32 " +
                        "POINTER_64 PSHORT PSIZE_T PSSIZE_T PSTR PTBYTE PTCHAR PTSTR PUCHAR PUHALF_PTR " +
                        "PUINT PUINT_PTR PUINT32 PUINT64 PULONG PULONGLONG PULONG_PTR PULONG32 PULONG64 " +
                        "PUSHORT PVOID PWCHAR PWORD PWSTR SC_HANDLE SC_LOCK SERVICE_STATUS_HANDLE SHORT " +
                        "SIZE_T SSIZE_T TBYTE TCHAR UCHAR UHALF_PTR UINT UINT_PTR UINT32 UINT64 ULONG " +
                        "ULONGLONG ULONG_PTR ULONG32 ULONG64 USHORT USN VOID WCHAR WORD WPARAM WPARAM WPARAM " +
                        "char bool short int __int32 __int64 __int8 __int16 long float double __wchar_t " +
                        "clock_t _complex _dev_t _diskfree_t div_t ldiv_t _exception _EXCEPTION_POINTERS " +
                        "FILE _finddata_t _finddatai64_t _wfinddata_t _wfinddatai64_t __finddata64_t " +
                        "__wfinddata64_t _FPIEEE_RECORD fpos_t _HEAPINFO _HFILE lconv intptr_t " +
                        "jmp_buf mbstate_t _off_t _onexit_t _PNH ptrdiff_t _purecall_handler " +
                        "sig_atomic_t size_t _stat __stat64 _stati64 terminate_function " +
                        "time_t __time64_t _timeb __timeb64 tm uintptr_t _utimbuf " +
                        "va_list wchar_t wctrans_t wctype_t wint_t signed "  +
                        // keywords
                        "break case catch class const __finally __exception __try " +
                        "const_cast continue private public protected __declspec " +
                        "default delete deprecated dllexport dllimport do dynamic_cast " +
                        "else enum explicit extern if for friend goto inline " +
                        "mutable naked namespace new noinline noreturn nothrow " +
                        "register reinterpret_cast return selectany " +
                        "sizeof static static_cast struct switch template this " +
                        "thread throw true false try typedef typeid typename union " +
                        "using uuid virtual void volatile whcar_t while " +
                        // functions
                        "assert isalnum isalpha iscntrl isdigit isgraph islower isprint" +
                        "ispunct isspace isupper isxdigit tolower toupper errno localeconv " +
                        "setlocale acos asin atan atan2 ceil cos cosh exp fabs floor fmod " +
                        "frexp ldexp log log10 modf pow sin sinh sqrt tan tanh jmp_buf " +
                        "longjmp setjmp raise signal sig_atomic_t va_arg va_end va_start " +
                        "clearerr fclose feof ferror fflush fgetc fgetpos fgets fopen " +
                        "fprintf fputc fputs fread freopen fscanf fseek fsetpos ftell " +
                        "fwrite getc getchar gets perror printf putc putchar puts remove " +
                        "rename rewind scanf setbuf setvbuf sprintf sscanf tmpfile tmpnam " +
                        "ungetc vfprintf vprintf vsprintf abort abs atexit atof atoi atol " +
                        "bsearch calloc div exit free getenv labs ldiv malloc mblen mbstowcs " +
                        "mbtowc qsort rand realloc srand strtod strtol strtoul system " +
                        "wcstombs wctomb memchr memcmp memcpy memmove memset strcat strchr " +
                        "strcmp strcoll strcpy strcspn strerror strlen strncat strncmp " +
                        "strncpy strpbrk strrchr strspn strstr strtok strxfrm asctime " +
                        "clock ctime difftime gmtime localtime mktime strftime time")
		           .mapping(
							pattern(MULTILINE_LINE_COMMENT).style(COMMENT_ID),
							pattern(SINGLE_LINE_COMMENT).style(COMMENT_ID),
							pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
							pattern(SINGLE_QUOTED_STRING).style(STRING_ID),
							pattern("\\s*#.*").style(CODE_ANNOTATION_ID))
		);
				
	}

	private void register(BrushBuilder... builders) {
		for (BrushBuilder builder : builders) {
			Collection<Brush> brushes = builder.build();
			for (Brush brush : brushes) {
				configurations.put(brush.getName(), brush);
			}
		}
	}

	public Brush get(String key) {
		Brush configuration = configurations.get(key);
		if(configuration == null){
			configuration = configurations.get(DEFAULT_CONFIGURATION);
		}
		return configuration;
	}

	public Set<String> getLanguages() {
		return configurations.keySet();
	}


}
