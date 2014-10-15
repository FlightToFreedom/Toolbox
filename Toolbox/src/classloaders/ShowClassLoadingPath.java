package classloaders;

import java.net.URLClassLoader;
import java.util.Arrays;

/**
 * 
 * This example shows where the ClassLoader(default), is loading the classes
 * from
 * 
 * @author Enrico
 * 
 * 
 */

public class ShowClassLoadingPath {

	public static void main(String... args) {

		System.out
				.println(Arrays
						.toString(((URLClassLoader) ShowClassLoadingPath.class
								.getClassLoader())
								.getURLs()));

	}

}