package algo.search;

public class SearchPosition {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        // int[] arr = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
        int[] arr = { 1, 3, 5, 7 };

        // int result = bs.search(arr, 90);
        int result = bs.search(arr, 0);
        System.out.println("result : " + result);

    }

}
