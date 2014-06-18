package urls;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class UrlReader {

	public static final String	API_ADDRESS	= "http://metadata.h08.comscore.mgmt:8080/metadata/rest/metadata/v1/uk-dax-demo/tables/DAX_LABELS/records";

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

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
