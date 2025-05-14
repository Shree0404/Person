public class Fib {
    public static void main(String[] args) {
        int n = 10;  // You can modify this value as needed
        System.out.println("Fibonacci Series up to " + n + " terms:");

        int first = 0, second = 1;
        System.out.print(first + " " + second + " "); // Print the first two terms

        // Generate the Fibonacci series
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
