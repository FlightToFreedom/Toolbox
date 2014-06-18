package regexp;

public class Match2 {

	static String	pattern	= "^www\\.microsoft\\.com/.*/download/confirmation\\.aspx$";
	static String	one		= "www.microsoft.com/here-a-test-value/download/confirmation.aspx";

	public static void main(String[] args) {
		System.out.println(one.matches(pattern));
	}
}
