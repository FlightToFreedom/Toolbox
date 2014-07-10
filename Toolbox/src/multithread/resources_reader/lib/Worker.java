package multithread.resources_reader.lib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import multithread.resources_reader.utils.StaticValues;

/**
 * This class takes care of reading a file and process it, it implements
 * Runnable as it will run in a separate Thread
 * 
 * @author eiorio
 * 
 */
public class Worker implements Runnable {

	private final File	file;

	/**
	 * The constructor will pass a file to it (A BufferedReader object actually)
	 */
	public Worker(File file, int index) {
		this.file = file;
		System.out.println("From thread.."
				+ index + ", reading file: "
				+ file.getAbsolutePath());// test
	}

	/**
	 * Run the job, since we do not mutate the state of the resource file, we do
	 * not need to synchronize this
	 */
	@Override
	public void run() {

		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(
									file)));

			try {
				String line;
				while ((line = reader.readLine()) != null) {
					String[] parts = line
							.split(StaticValues.TAB);
					System.out
							.println(parts.length);

				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

	}
}
