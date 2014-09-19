package regexp;

public class SimpleMatcher {

	public static void main(String... args) {
		String regex = "^https?://(shops|support)\\.mobistar\\.be";
		String vector = "http://shops.mobistar.be/b2c/";

		System.out.println(vector.matches(regex));
	}
}
