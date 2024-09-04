class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int l = 0;
        int r = 1;
        int profit = 0;
        while(r < prices.length){
            int low = prices[l];
            int high = prices[r];
            if(high > low){
                int temp = high - low;
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