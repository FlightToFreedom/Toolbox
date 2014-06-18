package commandline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CommandLineParser {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader(new File(
				args[0])));
		try {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			reader.close();
		}
		reader.close();
	}
}
