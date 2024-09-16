package algo.sort;

import java.util.Arrays;

public class QuickSort {

	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low, j = low;

		while (i <= high) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			i++;
		}

		return j - 1;
	}

	public void sort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			sort(arr, low, p - 1);
			sort(arr, p + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 5, 2, 0, 1, 6, 3 };
		int[] arr2 = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };

		QuickSort obj = new QuickSort();
		obj.sort(arr1, 0, arr1.length - 1);
		System.out.println(Arrays.toString(arr1));

		obj.sort(arr2, 0, arr2.length - 1);
		System.out.println(Arrays.toString(arr2));
	}

}
