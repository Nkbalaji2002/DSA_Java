/*
 * Merge Two Sorted Array
 */

package algo.sort;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static int[] merge(int[] arr1, int[] arr2, int m, int n) {
		int[] result = new int[m + n];
		int k = 0, j = 0, i = 0;

		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
			} else {
				result[k] = arr2[j];
				j++;
			}

			k++;
		}

		while (i < n) {
			result[k] = arr1[i];
			i++;
			k++;
		}

		while (j < m) {
			result[k] = arr2[j];
			j++;
			k++;
		}

		return result;
	}

	public static void main(String[] args) {
		// initialize the array
		int[] arr1 = { 2, 3, 5, 10 };
		int[] arr2 = { 4, 6, 11, 15 };

		int[] result = merge(arr1, arr2, arr1.length, arr2.length);
		System.out.println(Arrays.toString(result));

	}

}
