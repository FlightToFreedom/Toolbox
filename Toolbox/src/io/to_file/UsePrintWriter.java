package io.to_file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Simple class that explains the usage of the PrintWriter class
 * @author eiorio
 *
 */
public class UsePrintWriter {

	public static void main(String... args){
		//Input and output filenames
		String inputFileName="input.txt";
		String outputFileName="output.txt";

		//build a path object pointing to the resources dir
		final String path=new String("src/io/to_file/resources/");
		String inputFilePath=path.concat(inputFileName);
		String outputFilePath=path.concat(outputFileName);

		File inputFile=new File(inputFilePath);
		File outputFile=new File(outputFilePath);

		PrintWriter writer;
		FileReader reader;
		try{
			//init the writer
			writer=new PrintWriter(outputFile);
			//init the reader
			reader=new FileReader(inputFile);

			//read the input file
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
