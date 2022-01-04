package decimal_to_binary;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int decimalNum = s.nextInt();
        long binaryNum = 0;
        long base = 1;

        while(decimalNum > 0){
            int rem = decimalNum % 2;
            binaryNum = binaryNum + (rem * base);
            base = base * 10;
            decimalNum = decimalNum / 2;
        }

        System.out.println(binaryNum);

        s.close();
    }
}
