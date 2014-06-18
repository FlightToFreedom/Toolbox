package algorithms;

import java.util.ArrayList;
import java.util.List;

public class UnifyConsecutiveEntries {

	private static String[]	arr	= { "a", "a", "a", "b", "c", "a", "b", "g" };

	public static List<String> returnSimplified() {
		List<String> list = new ArrayList<String>();
		String tmp = "";
		for (String entry : arr) {
			if (entry != tmp) {
				tmp = entry;
				list.add(entry);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		for (String string : returnSimplified()) {
			System.out.println(string);
		}
	}
}
