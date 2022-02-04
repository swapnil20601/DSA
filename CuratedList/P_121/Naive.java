package P_121;

public class Naive {
    /* 
    Try out for following example:
    int[] arr = {3,5,1,7,4,9,4};
    int[] arr = {3,1,4,8,7,2,5};

    Note: This is O(N^2) brute force. This soln gives TLE on leetocde
    */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j] > prices[i]){
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
            }
        }

        return maxProfit;
    }
}
