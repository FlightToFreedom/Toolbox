package multithread.resources_reader.lib;

import java.io.File;

import multithread.resources_reader.utils.StaticValues;

/**
 * This class will generate anonimous classes, each one will implement runnable.
 * 
 * @author eiorio
 * 
 */
public class WorkerPool {

	/**
	 * Starts the job
	 */
	public void work() {
		// read the content of the 'resources' directory
		File resourcesDir = new File(
				StaticValues.PATH_TO_RESOURCES);

		File[] bucketsList = resourcesDir
				.listFiles();

		int idx = 0;
		for (File file : bucketsList) {
			idx++;
			// here we use the threads to read each file and perform an
			// operation on it
			new Thread(new Worker(file, idx)) {
			}.start();
		}
	}
}
