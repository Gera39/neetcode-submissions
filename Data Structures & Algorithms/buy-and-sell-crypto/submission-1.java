class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0, j = 1, p;        
        while (j < prices.length) {
            p = prices[j] - prices[i];
            if (p < 0) {
                i = j;
                j++;
                continue;
            }
            profit = Math.max(profit, p);
            j++;
        }
        return profit;
    }
}
