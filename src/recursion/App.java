package recursion;

public class App {
    static int count = 2;

    public static void Fibonacci(int a, int b) {
        if (count <= 10) {
            int c = a + b; // c - new fibonacci
            System.out.println(c);

            b = a;
            a = c;

            count++;

            Fibonacci(a, b);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.println(a);
        System.out.println(b);

        Fibonacci(b, a);
    }
}
