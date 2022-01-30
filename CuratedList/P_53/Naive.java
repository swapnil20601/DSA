package P_53;

/*
    Naive Approach: TC = O(N^3)
    If you are unable to come up with O(N^3) approach. See https://www.youtube.com/watch?v=2MmGzdiKR9Y&t=2s

    Try to make is better to O(N^2) by reducing the repeated work that you are doing in this approach
*/
public class Naive {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        //pick each & every element from array
        for (int i = 0; i < nums.length; i++) {
            //for each ith ele, go until end of array to find the subarray with max sum
            for (int j = i; j < nums.length; j++) {
                int total = 0;
                //k will start from ith ele and go till jth ele finding the total sum. The moment we find maximum sum, we will update it
                // & once k reaches jth ele we will reset total to 0 to find sum for next jth ele

                for (int k = i; k <= j; k++) {
                    total += nums[k];
                    maxSum = Math.max(maxSum, total);
                }
            }
        }

        return maxSum;
    }
}
