package io.to_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Simple class that explains the usage of the PrintWriter class, it uses a BufferedReader to read an input file and prints it into another "output" file using a PrintWriter
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

		PrintWriter writer=null;
		BufferedReader reader=null;
		try{
			//init the writer
			writer=new PrintWriter(outputFile);
			//init the reader
			reader=new BufferedReader(new FileReader(inputFile));

			//read the input file
			String line=null;
			if(outputFile.canWrite() && inputFile.canRead())
				while((line=reader.readLine())!=null)
					writer.println(line);

			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//release any resource associated with this
			writer.close();
		}

	}

}
