package regexp;

public class Match2 {

	static String	pattern	= "^.*2-.*$";
	static String	one		= "*2-*";

	public static void main(String[] args) {
		System.out.println(one.matches(pattern));
	}
}
