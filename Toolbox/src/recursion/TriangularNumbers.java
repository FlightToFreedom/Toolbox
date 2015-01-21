package recursion;

public class TriangularNumbers {

	public static void main(String... args) {
		System.out
				.println(getTriangularNumber(4));
	}

	public static int getTriangularNumber(
			int number) {
		if (number == 1) {
			return 1;
		} else {
			return number
					+ getTriangularNumber(number - 1);
		}
	}
}
