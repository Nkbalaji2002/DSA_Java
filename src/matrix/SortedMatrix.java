package matrix;

public class SortedMatrix {

    public void Search(int[][] matrix, int n, int x) {
        int i = 0;
        int j = n - 1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == x) {
                System.out.println("x found at - " + i + ", " + j);
                return;
            }

            if (matrix[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("Not Found!!!");

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 35, 39, 51 }
        };

        SortedMatrix obj = new SortedMatrix();

        obj.Search(matrix, matrix.length, 32); // found
        obj.Search(matrix, matrix.length, 50); // not found
    }

}
