package Recursion.RecursionLevel1;

public class FibonacciSequence {
    public static void main(String[] args) {

        System.out.println(fibno(5));  // Should print the 5th Fibonacci number
    }

    public static int fibno(int n) {
        //base condition
        if (n < 2) {
            return n;
        }
        return fibno(n - 1) + fibno(n - 2);
    }
}
