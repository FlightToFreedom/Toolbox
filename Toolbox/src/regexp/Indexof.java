package regexp;

public class Indexof {

	public static void main(String[] args) {

		String url = "ciao=jfghjdfhgjfbg&referrer=jghfgdgyd&bfgjhbhjgfbdfbgb";
		String ref = "referrer=";
		String part = url.substring((url.indexOf(ref) + ref.length()),
				url.length());
		System.out.println(part.substring(0, part.indexOf("&")));
	}
}
