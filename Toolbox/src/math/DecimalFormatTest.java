package math;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormatTest {

	public static void main(String[] args) {

		double number = 470.1;
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.UK);
		otherSymbols.setDecimalSeparator('.');
		otherSymbols.setGroupingSeparator('.');
		DecimalFormat def = new DecimalFormat("##.####", otherSymbols);
		String vector = def.format(number);
		fix(vector);
		System.out.println(Double.parseDouble(vector));

	}

	private static String fix(String number) {
		String decimals = number.substring(number.indexOf(".") + 1);
		switch (decimals.length()) {
		case 1:
			number = number + "000";
			break;
		case 2:
			number = number + "00";
			break;
		case 3:
			number = number + "0";
			break;
		}
		System.out.println(number);
		return number;
	}
}
