package dateandtimes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PlayWithDates {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		getDate(cal);
	}

	private static void getDate(Calendar cal) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"dd/MMM/yyyy");
		System.out.println(dateFormat.format(cal
				.getTime()));
	}
}
