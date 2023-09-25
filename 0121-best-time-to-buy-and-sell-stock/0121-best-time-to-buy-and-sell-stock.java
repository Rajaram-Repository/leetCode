class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,low=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<low)
                low=prices[i];
            if(prices[i]-low>profit)
                profit=prices[i]-low;
        }
        return profit;
    }
}