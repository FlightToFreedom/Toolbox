package algorithms;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		int p = 13;

		System.out.println(binarySearch(arr, p));

	}

	/**
	 * 
	 * Performs a binary search
	 * 
	 * @param arr
	 * 
	 * @param p
	 * 
	 * @return
	 */

	private static int binarySearch(int[] arr, int p) {

		int a = 0;

		int b = arr.length - 1;

		while (a < b) {

			if (arr[a] == p || arr[b] == p)

				return 1;

			int x = (a + b) / 2;

			if (arr[x] < p)

				a = x + 1;

			else

				b = x + 1;

		}

		return 0;

	}

}
