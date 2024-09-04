class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) {
            return 0;
        }
        else{ 
            int l = 0;
            int r = 1;
            int profit = 0;
            while(r < prices.length){
                if(prices[r] > prices[l]){
                    int temp = prices[r] - prices[l];
                    if(temp > profit){
                        profit = temp;
                    }
                    r++;
                }
                else{
                    l = r;
                    r++;
                }
            }
            return profit;
        }
    }
}