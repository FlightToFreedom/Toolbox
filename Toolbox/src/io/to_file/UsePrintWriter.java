package io.to_file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Simple class that explains the usage of the PrintWriter class
 * @author eiorio
 *
 */
public class UsePrintWriter {

	public static void main(String... args){
		//lets try to find out the current location
		String fileName="input.txt";
		StringBuilder path=new StringBuilder("src/io/to_file/resources/");
		path.append(fileName);
		File file=new File(path.toString());

		PrintWriter writer;
		try{
			writer=new PrintWriter(file);

		}catch(IOException e){
			e.printStackTrace();
		}

	}
}
