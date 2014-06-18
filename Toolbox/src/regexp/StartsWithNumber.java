package regexp;

public class StartsWithNumber {

	public static void main(String[] args) {
		String regexp = "^[0-9].*$";
		System.out.println("1ciao".matches(regexp));
	}

}
