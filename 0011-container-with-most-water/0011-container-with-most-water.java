class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while(l != r){
            int h1 = height[l];
            int h2 = height[r];
            int temp;

            if(h1 <= h2){
                temp = (r - l) * h1;
                l++;
            }
            else {
                temp = (r - l) * h2;
                r--;
            }
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }
}