package dateandtimes;

import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;

public class LastMonday {

	// monday is 1 in joda time
	public static void main(String[] args) {
		DateMidnight now = new DateMidnight();
		int day = now.get(DateTimeFieldType.dayOfWeek());
		int diff = 0;

		if (day != 1) {
			diff = (day - 1);
		}
		now = now.minusDays(diff);
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
