package algorithms;

public class InsertionSort {

	public static void main(String[] args) {

		int[] a = insertionSort(new int[] { 5, 8, 9, 1, 7, 6, 4, 36, 14 });
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static int[] insertionSort(int[] a) {

		int copy, i;
		for (i = 1; i < a.length; i++) {
			int tmp = a[i];
			copy = i;
			while (copy > 0 && a[copy - 1] >= tmp) {
				a[copy] = a[copy - 1];
				--copy;
			}
			a[copy] = tmp;
		}
		return a;
	}
}
