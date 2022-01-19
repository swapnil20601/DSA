/**
 * For given integer n, find f(n)th fibonacci term. For more details refer leetcode question:
 * https://leetcode.com/problems/fibonacci-number/
 */
public class Fibonacci {
    public static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
