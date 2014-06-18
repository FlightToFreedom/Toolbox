package algorithms;

public class SortingStrings {

	public static void main(String[] args) {
		String[] arr = { "test", "mare", "mele", "miele", "faff", "baar" };

		for (int i = 0; i < arr.length; i++) {
			int least = i;
			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[j].compareToIgnoreCase(arr[least]) < 0) {
					least = j;
				}
			}
			swap(arr, i, least);
		}

		for (String string : arr) {
			System.out.println(string);
		}
	}

	/**
	 * Replace the 2 elements in the given array
	 * 
	 * @param arr
	 * @param a
	 * @param b
	 */
	private static String[] swap(String[] arr, int a, int b) {
		String tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		return arr;
	}
}
