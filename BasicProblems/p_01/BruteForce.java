package p_01;

/**
 * Varoables" cum_fre = 0 & count = 1(for every i==j)
 * 1) Go through each ele in arr using i & see if it is not -inf. If it is not -inf then only enter inner for loop,  else skip that iteration
 * 2) For every ith ele see if that ele exists in arr by using j startoing from j = i+1
 * 3) If it exists then increment count & mark it as -inf
 * 4) Once you come out of jth for loop, add  count to cum_fre and print result
 * 5) Then rset cout = 1 again & countinue until i moves out of arr
 */


public class BruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 2, 2, 3, 4};
        int n = arr.length;
        int cumulative_freq = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
                cumulative_freq += count;
                System.out.println(arr[i] + "-->" + cumulative_freq);
            }
        }
    }
}

/*

TC = O(N^2)
SC = O(1)

Ex 1: int[] arr = {1, 2, 2, 1, 3, 4};
Ex 2: int[] arr = {1, 1, 1, 2, 2, 2};
*/
