class Solution {
    public int trap(int[] height) {
        int [] maxLeft = new int[height.length];
        int [] maxRight = new int[height.length];
        int [] min = new int[height.length];
        for(int i = 1; i < height.length; i++){
            if(height[i - 1] > maxLeft[i - 1]){
                maxLeft[i] = height[i - 1];
            }
            else {
                maxLeft[i] = maxLeft[i - 1];
            }
        }
        for(int i = height.length - 2; i >= 0; i--){
            if(height[i + 1] > maxRight[i + 1]){
                maxRight[i] = height[i + 1];
            }
            else {
                maxRight[i] = maxRight[i + 1];
            }
        }
        int water = 0;
        for(int i = 0; i < height.length; i++){
            min[i] = Math.min(maxLeft[i], maxRight[i]);
            if(min[i] - height[i] > 0) {
                water += min[i] - height[i];
            }
        }
        return water;
    }
}