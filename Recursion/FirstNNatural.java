import java.util.Scanner;

/**
 * Problem: Print First N Natural Numbers
 *  You are given an interger n ranging from 1 <= n <= 10000.
 * You have to print numbers starting from 1 till n.
 * 
 * Eg: 6. You should print = 1 2 3 4 5 6 
 * Eg: 2:. O/P = 1 2
 * Eg: 1: O/P = 1
 */

public class FirstNNatural {
    public static void printNatural(int n){
        if(n == 0){
            return;
        }

        printNatural(n - 1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printNatural(n);
        scan.close();
    }
}
