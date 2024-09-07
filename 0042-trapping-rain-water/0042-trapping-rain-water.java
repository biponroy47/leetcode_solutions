class Solution {
    public int trap(int[] height) {
        int lp = 0;
        int maxl = height[0];
        int rp = height.length - 1;
        int maxr = height[rp];
        int water = 0;

        while(lp != rp){
            int min = Math.min(maxl, maxr); 
            if(maxl <= maxr) {
                if(min - height[++lp] > 0){
                    water += min - height[lp];
                }
                if(height[lp] > maxl){
                    maxl = height[lp];
                }
            }
            else {
                if(min - height[--rp] > 0){
                    water += min - height[rp];
                }
                if(height[rp] > maxr){
                    maxr = height[rp];
                }
            }
        }

        return water;
    }
}