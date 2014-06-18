package math;

public class ExponentialAnnotation {

	public static void main(String[] args) {

		String number = "2.46265121E8";
		Double parsed = Double.parseDouble(number);
		Long longed = parsed.longValue();
		System.out.println(longed);
	}
}
