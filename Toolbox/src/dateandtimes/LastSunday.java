package dateandtimes;

import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;

public class LastSunday {
	// sunday is 7 in joda time
	public static void main(String[] args) {
		DateMidnight now = new DateMidnight();
		int day = now.get(DateTimeFieldType.dayOfWeek());
		int diff = 0;

		if (day != 7) {
			diff = (7 - (7 - day));
		}
		now = now.minusDays(diff);
		System.out.println(convertDateMidnightToString(now));
	}

	/**
	 * TEST
	 * 
	 * @param date
	 * @return
	 */
	public static String convertDateMidnightToString(DateMidnight date) {
		return Integer.toString(date.getYear())
				+ String.format("%02d", date.getMonthOfYear())
				+ String.format("%02d", date.getDayOfMonth());
	}
}
