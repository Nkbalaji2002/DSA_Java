package algo.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 1, 9, 2, 10 };

        BubbleSort obj = new BubbleSort();

        obj.bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public void bubbleSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;

            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (isSwapped == false) {
                break;
            }

        }
    }

}
