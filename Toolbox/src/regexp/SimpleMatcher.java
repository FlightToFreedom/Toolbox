package regexp;

public class SimpleMatcher {

	public static void main(String... args) {
		String regex = "^https?://e\\-services\\.mobistar\\.be.*";
		String vector = "http://e-services.mobistar.be/b2c/";

		System.out.println(vector.matches(regex));
	}
}
