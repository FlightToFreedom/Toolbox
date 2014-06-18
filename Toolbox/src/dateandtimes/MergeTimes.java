package dateandtimes;

import java.util.Calendar;

public class MergeTimes {

	public static void main(String[] args) {
		String time = "01:20:05";
		Long l = merge(time);
		System.out.println(l);
		explode(l.intValue());
	}

	// Expected format: hh:mm:ss
	private static long merge(String time) {
		long millis = 0l;
		Integer hours = Integer.parseInt(time.substring(0, 2));
		Integer minutes = Integer.parseInt(time.substring(3, 5));
		Integer seconds = Integer.parseInt(time.substring(6));

		millis += hours * 3600000;
		millis += minutes * 60000;
		millis += seconds * 1000;
		return millis;
	}

	private static void explode(int millis) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.add(Calendar.MILLISECOND, millis);

		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":"
				+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
	}
}
