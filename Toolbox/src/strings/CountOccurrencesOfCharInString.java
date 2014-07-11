package strings;

public class CountOccurrencesOfCharInString {

	public static void main(String[] args) {
		String vector = "1▼0▼com.bskyb.skygo▼0▼2506548▼0▼iPad3,3▼2202172▼397594045▼0▼1▼3▼2202172▼1398244027776▼1404299249856▼1398244027776▼397594045▼▼▼▼0▼▼ios▼7.1.1▼▼▼0▼228▼▼wifi▼▼SkyGo/203774 CFNetwork/672.1.14 Darwin/14.0.0▼▼▼▼2.121.190.58▼Application▼▼▼▼▼▼SkyGo▼▼▼▼1404299249858▼1404299249287▼slough▼%IPG_2046%▼C58B959D34A91E9EF3B3209A024340E7-cs62▼alias▼▼43649287▼view▼▼▼▼▼▼▼▼▼▼▼▼▼▼0▼0▼0▼0▼▼▼0▼0▼▼▼▼▼▼▼0▼0▼▼▼▼▼▼▼0▼▼▼▼▼▼0▼0▼0▼0▼▼0▼0▼0▼▼0▼▼▼0▼0▼▼▼0▼▼▼▼0▼";
		Character charToFind = '▼';

		int res = 0;
		for (char c : vector.toCharArray()) {
			if (charToFind.equals(c)) {
				res++;
			}
		}
		System.out
				.println("Final res is: " + res);
	}
}
