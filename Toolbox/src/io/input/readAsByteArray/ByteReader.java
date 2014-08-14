package io.input.readAsByteArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Simple demonstration of how a file can be read as Array of Bytes[]. This
 * class first reads all the bytes in a file using the
 * <code>Files.readAllBytes()</code> method
 * "You will need jdk 1.7 to compile this", then prints them to stdout in one
 * line, only when a lneseparator is met (10) it will print a new line
 * 
 * @author eiorio
 * 
 */
public class ByteReader {

	private final String	path_to_file;

	public ByteReader(String path_to_file) {
		this.path_to_file = path_to_file;
	}

	/**
	 * Provide the resource
	 */
	public void read() {

		byte[] charArray;

		try {
			charArray = Files.readAllBytes(Paths
					.get(path_to_file));
			for (byte b : charArray) {
				if (b == 10) {
					System.out.println();
				} else {
					System.out.print((char) b);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
