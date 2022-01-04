package reverse_number;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = scan.nextInt();
        int reversedNum = 0;

        while(num > 0){
            int remainder = num % 10;
            reversedNum = remainder + (reversedNum * 10);
            num = num / 10;
        }

        System.out.println(reversedNum);

        scan.close();
    }
}
