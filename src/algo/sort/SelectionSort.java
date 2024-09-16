package algo.sort;

import java.util.Arrays;

public class SelectionSort {
	
	// selection sort method
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min] ) {
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		// selection sort using object
		SelectionSort obj = new SelectionSort();
		
		int[] arr = {
				5, 1, 10, 2, 9
		};
		
		obj.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
