package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestId {

	public static void main(String[] args) {
		String regx = "^([0-9]+)_.+";
		Pattern pattern = Pattern.compile(regx);
		String cavia = "1007705224953_1";
		Matcher matcher = pattern.matcher(cavia);
		if (matcher.find()) {
			// String res = cavia.substring(0, cavia.indexOf('_'));
			System.out.println(matcher.group(1));
		}
	}
}
