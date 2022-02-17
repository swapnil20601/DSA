package P_1180;

//Here we reduce extra psace tha we are using in Approach 1 and doing it in O(1) space.
public class Better {
    public int countLetters(String S) {
        int total = 1, count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i-1)) {
                count++;
            } else {
                count = 1;
            }
            total += count;
        }
        return total;
    }
}

/* 
We are making use of 2 variables count that keeps track of repeating characters &
total which at the end gives us total sum(similar to count varibale in approach 1)

Also checkpout this soln with 2 ptrs.
It is used in many subarray substring count problems:
https://leetcode.com/problems/count-substrings-with-only-one-distinct-letter/discuss/1003859/Java-2-Pointer-Solution-Beats-100
*/