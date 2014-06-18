package dateandtimes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatUsage {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));

	}
}
