package mergeSorting;

class MergeSort {

	public static void sort(int[] a) {

		int p = 0;
		int r = a.length - 1;
		System.out.println(p);
		System.out.println(r);
		mergeSort(a, p, r);

	}

	private static void mergeSort(int[] arr, int p, int r) {

		int q;

		if (p < r) {

			q = (p + r) / 2;
			mergeSort(arr, p, q);
			mergeSort(arr, q + 1, r);
			merge(arr, p, q, r);

		}
	}

	private static void merge(int[] a, int p, int q, int r) {

		int n1, n2, i, j;
		n1 = q - p + 1;
		n2 = r - q;

		int left[] = new int[n1 + 1];
		int right[] = new int[n2 + 1];

		for (i = 0; i < n1; i++) {

			left[i] = a[p + i];
		}

		for (j = 0; j < n2; j++) {

			right[j] = a[q + 1 + j];
		}

		left[n1] = 9999999;
		right[n2] = 9999999;

		i = 0;
		j = 0;

		for (int k = p; k <= r; k++) {

			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			}

			else {
				a[k] = right[j];
				j++;
			}
		}
	}

}
