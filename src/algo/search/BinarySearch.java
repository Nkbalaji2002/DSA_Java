package algo.search;

public class BinarySearch {

    public int search(int[] nums, int key) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == key) {
                return mid;
            }

            if (key < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();

        int[] arr = { 5, 1, 9, 2, 10, 15, 20 };
        int result = obj.search(arr, 10);
        System.out.println("result : " + result);

    }

}
