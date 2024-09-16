class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int out = 0;
        int product;

        for(int left = 0; left < nums.length; left++){
            product = nums[left];
            if(product >= k) continue;
            out++;

            for(int right = left + 1; right < nums.length; right++){
                if(right == left) {
                    out++;
                }
                else if(product * nums[right] < k){
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