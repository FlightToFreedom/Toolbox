package dateandtimes;

import java.util.Calendar;

public class ModifyFields {

	public static void main(String[] args) {
		Calendar cal = setTimeToTwoAm(Calendar.getInstance());
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.MILLISECOND));
	}

	private static Calendar setTimeToTwoAm(Calendar cal) {
		cal.set(Calendar.HOUR_OF_DAY, 02);
		cal.set(Calendar.MINUTE, 00);
		cal.set(Calendar.SECOND, 00);
		cal.set(Calendar.MILLISECOND, 0);
		return cal;
	}
}
