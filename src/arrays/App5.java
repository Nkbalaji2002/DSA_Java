package arrays;

// Update Operation 
public class App5 {
    public static void main(String[] args) {
        int LA[] = new int[5];
        int newNumber = 15;
        System.out.println("The array elements are : ");

        for (int i = 0; i < LA.length; i++) {
            LA[i] = i + 2;
            System.out.println("LA[" + i + "] = " + LA[i]);
        }

        LA[3] = newNumber;

        System.out.println("The array elements after updation are : ");
        for (int i = 0; i < LA.length; i++) {
            System.out.println("LA[" + i + "] = " + LA[i]);
            ;
        }
    }
}
