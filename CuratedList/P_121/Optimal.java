package P_121;

/* 
    Try out for following example:
    int[] arr = {3,5,1,7,4,9,4};
    int[] arr = {3,1,4,8,7,2,5};

    TC = O(N)
    SC= O(N)

    We use trick that we consider each stock at ith day as Max Selling price & we try to find the least Buying
    price for that stock such that, Max SP - Min BP = Max profit 
    */
public class Optimal {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currMin = Integer.MAX_VALUE;

        for (int price : prices) {
            currMin = Math.min(currMin, price);

            int currProfit = price - currMin;

            maxProfit = Math.max(maxProfit, currProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,7,4,9,4};
        //int[] arr = {3,1,4,8,7,2,5};
        System.out.println(maxProfit(arr));
    }
}
