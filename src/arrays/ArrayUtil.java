package arrays;

public class ArrayUtil {

    // Adding or updating elements in an array
    public void arrayDemo() {
        int myArr[] = new int[5];

        // add the elements
        myArr[0] = 5;
        myArr[1] = 1;
        myArr[2] = 8;
        myArr[3] = 2;
        myArr[4] = 10;

        // update the elements
        myArr[2] = 9;

        printArray(myArr);
    }

    // Print elements of an array
    public static void printArray(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
    }

    // Remove Even Integers from an Array
    public static int[] removeEven(int[] arr) {
        // find the odd count
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        // find the odd numbers based on odd count
        int[] result = new int[oddCount];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }

        return result;
    }

    // Reverse Array
    public static void reverseArray(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    // Find Second Maximum Value in an array
    public int findSecondMax(int[] myArr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > max) {
                secondMax = max;
                max = myArr[i];
            } else if (myArr[i] > secondMax && myArr[i] != max) {
                secondMax = myArr[i];
            }

        }
        return secondMax;
    }

    // Move all Zero's To End of Array
    public void moveZeros(int[] arr, int n) {

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[j] != 0) {
                j++;
            }
        }
    }

    // how to resize the array
    public int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        return temp;
    }

    // Find the missing number of array
    public int findMissingNumber(int[] arr) {

        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;

        for (int i : arr) {
            sum = sum - i;
        }

        return sum;
    }

    // how to check if a String is polindrome or not
    public boolean isPolindrome(String word) {

        char[] charArr = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (charArr[start] != charArr[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayUtil myArrayUtil = new ArrayUtil();
        // myArrayUtil.arrayDemo();

        // int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
        // printArray(arr);
        // int[] result = removeEven(arr);
        // printArray(result);

        // int[] resultArr = { 8, 11, 5, 10, 7, 2 };
        // reverseArray(resultArr, 0, resultArr.length - 1);
        // printArray(resultArr);

        // int[] arr = { 12, 34, 2, 34, 33, 1 };
        // System.out.println(myArrayUtil.findSecondMax(arr));

        // int[] arr = { 8, 1, 0, 2, 1, 0, 3 };
        // myArrayUtil.moveZeros(arr, arr.length);
        // printArray(arr);

        // int[] arr = { 5, 9, 3, 10 };
        // System.out.println("Before resize the array : " + arr.length);
        // int[] resultArr = myArrayUtil.resize(arr, arr.length * 2);
        // System.out.println("After resize the array : " + resultArr.length);

        // int[] arr = { 1, 2, 3, 5 };
        // int[] arr = { 2, 4, 1, 8, 6, 3, 7 };
        // System.out.println(myArrayUtil.findMissingNumber(arr));

        String word = "madam";
        System.out.println(myArrayUtil.isPolindrome(word));

        word = "that";
        System.out.println(myArrayUtil.isPolindrome(word));

    }

}
