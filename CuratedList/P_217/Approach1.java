package P_217;

import java.util.Arrays;

/*
The naive approach would be to run a iteration for each element and see whether a duplicate value can be found: \
this results in O(N^2) time complexity & O(1) space


Approach 1: Using Sorting
    1. Sort array
    2. Check if any of the contiguous elements are same
    3. If yes then return true else false

    TC = O(n log n) for sorting + O(n) for scanning sorted array = O(n log n)
    SC = O(1)
*/

public class Approach1 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
    }
}
