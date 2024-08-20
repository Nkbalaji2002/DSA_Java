package arrays;

public class MinArray {

    // find the minimum value in the array
    public int findMinimum(int[] arr) {

        // edge
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input!!!");
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    // main method
    public static void main(String[] args) {
        int[] myArr = { 5, 9, 3, 15, 1, 2 };

        MinArray minArray = new MinArray();
        System.out.println(minArray.findMinimum(myArr));

    }
}
