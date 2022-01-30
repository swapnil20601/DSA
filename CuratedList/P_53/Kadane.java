package P_53;

/**
 * This is optimal approach using Kadane's algo. If sol is unclear see https://www.youtube.com/watch?v=VMtyGnNcdPw
 * TC = O(N)
 */
public class Kadane {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], nums[i] + currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
