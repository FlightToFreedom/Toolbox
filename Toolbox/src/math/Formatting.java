package math;

public class Formatting {

	public static void main(String[] args) {
		Double n = Double.parseDouble("7.789795531406E12");
		// System.out.println(Math.round(n * 100) / 100);

		// DecimalFormatSymbols otherSymbols = new
		// DecimalFormatSymbols(Locale.UK);
		// otherSymbols.setDecimalSeparator('.');
		// otherSymbols.setGroupingSeparator('.');
		// DecimalFormat def = new DecimalFormat("###.###", otherSymbols);

		System.out.println(n.intValue());
	}
}
