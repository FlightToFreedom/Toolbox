package math;

public class RangeIp {

	public static void main(String[] args) {

		String[] IP_FLAG_RANGE_1 = { "46.218.210.97", "46.218.210.126" };
		String external = "46.218.210.200";

		int lastIndexFirstIp = IP_FLAG_RANGE_1[0].lastIndexOf('.');
		int lastPartFirstIp = Integer.parseInt(IP_FLAG_RANGE_1[0].substring(
				lastIndexFirstIp + 1, IP_FLAG_RANGE_1[0].length()));

		int lastPartLastIp = Integer.parseInt(IP_FLAG_RANGE_1[1].substring(
				lastIndexFirstIp + 1, IP_FLAG_RANGE_1[1].length()));

		int lastPartExternal = Integer.parseInt(external.substring(
				lastIndexFirstIp + 1, external.length()));

		if (lastPartExternal > lastPartFirstIp
				&& lastPartExternal < lastPartLastIp) {
			System.out.println("true");
		}
		System.out.println(lastPartFirstIp + " / " + lastPartLastIp + " / "
				+ lastPartExternal);
	}
}
