package recursion;

public class App2 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 0; i < 10; i++) {
            int c = a + b;
            System.out.println("c : " + c);

            b = a;
            a = c;
        }
    }
}
