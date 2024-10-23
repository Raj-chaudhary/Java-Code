public class BuySellStockWithKTransaction {

public static int Buy_Sell_Stock(int prices[], int k){
    int n = prices.length;
    // If no prices or no transactions, no profit can be made
    if (n == 0 || k == 0) {
        return 0;
    }
     // Create a 2D array for storing the max profit
        // dp[t][d] represents the maximum profit achievable with t transactions on day d
        int[][] dp = new int[k + 1][n];

        // Iterate over the number of transactions
        for (int t = 1; t <= k; t++) {
            int maxDiff = -prices[0]; // Track the maximum difference

            // Iterate over the days
            for (int d = 1; d < n; d++) {
                // Calculate max profit by selling at prices[d] or not selling on that day
                dp[t][d] = Math.max(dp[t][d - 1], prices[d] + maxDiff);
                // Update maxDiff to represent the best day to buy before day d
                maxDiff = Math.max(maxDiff, dp[t - 1][d] - prices[d]);
            }
        }

        // The result will be in dp[k][n-1] (max transactions on the last day)
        return dp[k][n - 1];
    
   
}

    public static void main(String[] args) {
        int prices[] = { 2, 5, 7, 8, 0, 9 };
        int k = 2; // Number of transactions allowed
        System.out.println(Buy_Sell_Stock(prices, k));
    }

}
