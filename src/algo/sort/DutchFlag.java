package algo.sort;

import java.util.Arrays;

public class DutchFlag {

	public void threeNumberSort(int[] arr) {
		int i = 0, j = 0, k = arr.length - 1;

		while (i <= k) {
			if (arr[i] == 0) {
				swap(arr, i, j);
				i++;
				j++;
			} else if (arr[i] == 1) {
				i++;
			} else if (arr[i] == 2) {
				swap(arr, i, k);
				k--;
			}
		}
	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 2, 0, 1, 1 };

		DutchFlag obj = new DutchFlag();
		obj.threeNumberSort(arr);

		System.out.println(Arrays.toString(arr));
	}

}
