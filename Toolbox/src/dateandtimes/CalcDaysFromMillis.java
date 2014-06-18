package dateandtimes;

public class CalcDaysFromMillis {

	public static void main(String[] args) {
		long day = 86400000;
		long start = 1372287600367l;
		long end = 1372798971260l;

		Long diff = end - start;
		System.out.println(diff);
		Long x = diff / day;
		System.out.println(x.intValue());
	}
}
