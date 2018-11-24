import java.util.Scanner;


class Fibonacci {

    static long fib(long n) {

        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        System.out.print("Enter What term to display: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(fib(n));
    }
}