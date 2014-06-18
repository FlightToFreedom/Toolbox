package algorithms;

public class SortInts {

	private static int[]	arr	= { 0, 8, 6, 1, 7, 45, 3, 12, 9 };

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < arr.length; i++) {
			int least = i;

			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[j] < arr[least]) {
					least = j;
				}
			}
			swap(arr, i, least);
		}

		// sorted array on stdout
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * Swaps two elements in the given array
	 * 
	 * @param arr
	 * @param one
	 * @param two
	 * @return
	 */
	private static int[] swap(int[] arr, int i, int least) {
		int tmp = arr[i];
		arr[i] = arr[least];
		arr[least] = tmp;
		return arr;
	}

}
