package P_53;

/**
 * Better Approach: TC = O(N^2)
 * 
 * In this approach we are reducing the recalculation of sum again & again that
 * we did in Naive soln.
 * We see that as j moves to next index, we reset k = i & sum = 0 again &
 * calculate sum again.
 * Then y not re-use the sum that we have already calculated?
 * So instead of resetting sum = 0 after j reaches end of array,
 * we can keep on adding jth ele to the sum as j moves to the next ele.
 * In this way we dont need 3rd loop
 */
public class Better {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        // pick each & every element from array
        for (int i = 0; i < nums.length; i++) {

            int total = 0;

            // for each ith ele, go until end of array & also keep on adding that ele to the sum as j moves.
            // Then reset sum = 0 when j reaches at the end
            for (int j = i; j < nums.length; j++) {
                total += nums[j];
                maxSum = Math.max(maxSum, total);
            }
        }

        return maxSum;
    }
}
