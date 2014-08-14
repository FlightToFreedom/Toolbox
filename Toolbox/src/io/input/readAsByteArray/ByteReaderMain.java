package io.input.readAsByteArray;

import java.io.File;

/**
 * Runs src\io\input\readAsByteArray\ByteReader.java
 * 
 * @author eiorio
 * 
 */
public class ByteReaderMain {

	private static String	PATH	= "src%io%resources%random_data.txt";

	public static void main(String[] args) {
		String sep = File.separator;
		PATH = PATH.replace("%", sep);
		ByteReader br = new ByteReader(PATH);
		br.read();
	}

}
