package urls;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class UrlReader {

	public static final String	API_ADDRESS	= "http://www.repubblica.it/";

	public static void main(String... args) {

		URL url;

		try {
			url = new URL(API_ADDRESS);
			URLConnection conn = url
					.openConnection();

			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn
							.getInputStream()));

			String input;
			List<String> lines = new ArrayList<String>();

			while ((input = reader.readLine()) != null)
				lines.add(input);

			reader.close();
			for(String line:lines){
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
