package p_01;

import java.sql.Array;
import java.util.Arrays;

/**
 * Use sorting
 * 1) Sort array
 * 2) Variable = cum_fre = 0, count = 1(to store freq of each element in array)
 * 3) Go trough soretd array and increment count if arr[i] == arr[i-1]
 * 4) Else if not then, see if i is in range of arr.length & that arr[i] != arr[i-1], then
 *      add count to cum_freq, print it & reset count = 1
 */
public class Better {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 2, 2, 3, 4};
        int n = arr.length;
        int cumulative_freq = 0;
        int count = 1;

        Arrays.sort(arr);

        for (int i = 1; i <= n; i++) {
            if(i == n || arr[i-1] != arr[i]){
                cumulative_freq += count;
                System.out.println(arr[i-1] + "-->" + cumulative_freq);
                count = 1;
            }
            else{
                count++;
            }
        }
    }
}

/**
 * Tc = O(n log n) for sorting arrays + O(N) to traverse arr again and count freq of each ele = O(N log N)
 * SC = O(1)
 */
