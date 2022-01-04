package binary_to_decimal;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long binaryNum = scan.nextLong();

        long decimalNum = 0;
        int base = 1;

        while(binaryNum > 0){
            Long rem = binaryNum % 10;
            decimalNum = decimalNum + rem * base;
            base = base * 2;
            binaryNum = binaryNum / 10;
        }
        
        System.out.println(decimalNum);
        
        scan.close();
    }
}
