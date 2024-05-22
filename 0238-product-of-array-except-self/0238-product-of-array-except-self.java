class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] res = new int [len];
        int left = 1, right = 1;
        for(int i = 0; i < len; i++){
            res[i] = left;
            left *= nums[i];
        }
        for(int i = len - 1; i >= 0; i--){
            res[i] *= right; 
            right *= nums[i];
        }
        return res;
    }
}