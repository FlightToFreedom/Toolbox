package dates_and_times;

import java.util.Calendar;

import org.joda.time.DateTime;

public class AddDays {

	public static void main(String[] args) {

		DateTime end = new DateTime(Calendar.getInstance());
		DateTime start = new DateTime(end.minusDays(5));
		// System.out.println(start.toString());
		// System.out.println(end.toString());
		// System.out.println();
		//
		// while (start.isBefore(end)) {
		// start = start.plusDays(1);
		// System.out.println(start.toString());
		// }

		while (start.isBefore(end)) {
			System.out.println("before " + start.toString());
			start = start.plusDays(1);
			System.out.println("after " + start.toString());
		}
	}
}
