class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int out = 0;
        int product = 0;

        for(int left = 0; left < nums.length; left++){
            for(int right = left; right < nums.length; right++){
                if(right == left && nums[right] < k) {
                    product = nums[right];
                    out++;
                }
                else if(right != left && product * nums[right] < k){
                    product *= nums[right];
                    out++;
                }
                else {
                    break;
                }
            }
        }

        return out;
    }
}