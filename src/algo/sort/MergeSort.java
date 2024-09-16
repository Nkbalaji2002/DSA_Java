/*
 * Merge Sort Algorithm Program
 */

package algo.sort;

import java.util.Arrays;

public class MergeSort {

	public static void Sort(int[] arr, int[] temp, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			Sort(arr, temp, low, mid);
			Sort(arr, temp, mid + 1, high);
			Merge(arr, temp, low, high, mid);
		}
	}

	public static void Merge(int[] arr, int[] temp, int low, int high, int mid) {
		for (int i = low; i <= high; i++) {
			temp[i] = arr[i];
		}

		int i = low, j = mid + 1, k = low;

		while (i <= mid && j <= high) {
			if (temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			} else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			arr[k] = temp[i];
			k++;
			i++;
		}
	}

	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// initialize the array
		int[] arr = { 2, 10, 5, 3, 4, 6, -1 };

		int[] temp = new int[arr.length];

		Sort(arr, temp, 0, arr.length - 1);
		printArray(arr);
	}

}
