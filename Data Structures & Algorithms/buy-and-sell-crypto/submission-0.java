class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int j = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[j]  < prices[i] ){
                result = Math.max(result, (prices[i] - prices[j]));
            }
            else{
            j = i; 
            } 
        }




        return result;
    }
}
