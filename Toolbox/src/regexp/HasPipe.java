package regexp;

public class HasPipe {

	static String	prefix				= "/regexp/";
	static String	simplePairRegexp	= "^[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*;/regexp/[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*$";
	static String	multiplePairRegexp	= "^[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*;[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*;/regexp/[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*$";
	static String	simplePair			= "^[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*;[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*";
	static String	multiplePair		= "^[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*;[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*\\|[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*;[a-zA-Z0-9\\^\\$\\|\\(\\)\\_]*";

	public static void main(String[] args) {
		String test1 = "rte_vs_sn;/regexp/^(^pl$|^sport$|^ten$|^news$|^tv$|^radio$|^lifestyle$|^orch$|^shop$|^comm$|^more$)";
		String test2 = "rte_vs_sn;pl|rte_vs_an;pl";
		String test3 = "rte_vs_pl;mob|rte_vs_an;/regexp/^(^rnn$|^pl$|^rpl$|^r1$|^2fm$|^doc$|^mo$|^ppl$|^hac$)";
		String test4 = "rte_vs_sn;food";

		// if (isRegexp(test1)) {
		// test1 = clean(test1);
		// String[] content = test1.split("\\;");
		// System.out.println(content[0] + " == " + content[1]);
		// }
		System.out.println(isSimpleRegexp(test4));
		System.out.println(isSimpleRegexp(test2));
		System.out.println(isSimpleRegexp(test1));
		System.out.println(isSimpleRegexp(test3));
	}

	private static boolean isRegexp(String s) {
		return s.contains("/regexp/");
	}

	private static boolean isSimpleRegexp(String s) {
		return s.matches(multiplePair);
	}

	private static String clean(String s) {
		s = s.replace("/regexp/", "");
		return s;
	}
}
