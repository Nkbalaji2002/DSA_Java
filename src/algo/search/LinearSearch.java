package algo.search;

public class LinearSearch {

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();

        int[] arr = { 5, 1, 9, 2, 10, 15, 20 };

        int result = obj.search(arr, 10);
        System.out.println("result : " + result);
    }

    public int search(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

}
