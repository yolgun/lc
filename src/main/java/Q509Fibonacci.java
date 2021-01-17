public class Q509Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n ; i++) {
            int tmp = first + second;
            first = second;
            second = tmp;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(10));
    }
}
