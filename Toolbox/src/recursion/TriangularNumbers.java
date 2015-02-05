package recursion;

public class TriangularNumbers {

	public static void main(String... args) {
		System.out.println("Final result "
				+ getTriangularNumber(4));
	}

	public static int getTriangularNumber(
			int number) {
		System.out.println("Entering with: "
				+ number);
		if (number == 1) {
			return 1;
		} else {
			int tmp = number
					+ getTriangularNumber(number - 1);
			System.out
					.println("Returning...tmp is "
							+ tmp);
			return tmp;
		}
	}
}
