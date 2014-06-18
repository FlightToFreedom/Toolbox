package networking;

import networking.SubnetUtils.SubnetInfo;

public class IsWithinNetwork {

	public static void main(String... args) {

		SubnetUtils netUtil = new SubnetUtils(
				"10.11.5.164/6");
		SubnetInfo info = netUtil.getInfo();
		System.out.println(info
				.isInRange("10.99.99.999"));
	}

}
