package buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Reader {

	private static Map<String, String>	records	= new HashMap<String, String>();

	public static void main(String[] args) throws IOException {
		makeMap();
		exploreMap(records);
	}

	private static void makeMap() {

		BufferedReader reader = null;

		try {
			String currentLine;
			reader = new BufferedReader(
					new FileReader(
							"D:\\Users\\eiorio\\workspace\\MyStuff\\src\\buffered_reader\\catchers.txt"));

			while ((currentLine = reader.readLine()) != null) {
				String[] parts = currentLine.split("\\t");
				if (parts.length == 2) {
					records.put(parts[0], parts[1]);
				} else {
					records.put(parts[0], "");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void exploreMap(Map<String, String> map) {
		System.out.println(map.size());
		for (String string : map.keySet()) {
			System.out.println(string + " " + map.get(string));
		}
	}
}
