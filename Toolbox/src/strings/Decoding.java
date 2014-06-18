package strings;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Decoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String one = "D%E9bardeur";
		System.out.println(one);
		System.out.println(one = URLDecoder.decode(one, "ISO-8859-15"));
	}
}
