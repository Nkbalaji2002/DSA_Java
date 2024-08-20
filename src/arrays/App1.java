package arrays;

// Insertion Operation
public class App1 {
    public static void main(String[] args) {
        int LA[] = new int[3];

        System.out.println("Array Before Insertion : ");

        for (int i = 0; i < 3; i++) {
            // prints empty array
            System.out.println("LA[" + i + "] = " + LA[i]);
        }
        System.out.println("Inserting elements..");

        // Printing Array after insertion
        System.out.println("Array After Insertion : ");

        for (int i = 0; i < LA.length; i++) {
            LA[i] = i + 3;
            System.out.println("LA[" + i + "] = " + LA[i]);
        }

    }
}
