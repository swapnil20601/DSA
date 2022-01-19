import java.util.Scanner;

/**
 * Problem: You are given an integer n. You have to find how many digits does it contain.
 * Eg: n = 156. Since it contains 3 digits, so output should be 3
 * Eg: n = 7. O/P = 1
 * Eg: n = 600. O/P = 3
 * 
 * Constraints : 1 <= n <= 10^6
 */


public class NumberOfDigits {
    public static int count(int n){
        if(n == 0){
            return 0;
        }

        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(count(n));
        scan.close();
    }
}
