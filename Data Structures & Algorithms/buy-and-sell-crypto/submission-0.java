class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;
        for(int i=0;i<n;i++){
            if(prices[i] < min){
                min = prices[i];
            }

            //calculate current profit
            int currentProfit = prices[i] - min;
            
            //compare with max Profit
            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
