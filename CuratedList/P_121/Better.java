package P_121;

/* 
    Try out for following example:
    int[] arr = {3,5,1,7,4,9,4};
    int[] arr = {3,1,4,8,7,2,5};

    TC = O(N)
    SC = O(N)

    We create aux array of maximum selling price of Stock suck that, buying price at ith day - max SP for that day = always gives
    maximum profit
    */
public class Better {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        int currMax = Integer.MIN_VALUE;

        int[] maxSellingPrice = new int[prices.length];

        for (int i = prices.length-1; i >= 0; i--) {
            currMax = Math.max(currMax, prices[i]);
            maxSellingPrice[i] = currMax;
        }

        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, maxSellingPrice[i] - prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        //int[] arr = {3,5,1,7,4,9,4};
        int[] arr = {3,1,4,8,7,2,5};
        System.out.println(maxProfit(arr));
    }
}
