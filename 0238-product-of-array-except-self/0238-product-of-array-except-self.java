class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int [nums.length];
        int [] lefts = new int [nums.length];
        int [] rights = new int [nums.length];
        int left = 1, right = 1;
        
        for(int i = 0; i < nums.length; i++){
            lefts[i] = left * nums[i];
            left = lefts[i];
        }
        for(int i = nums.length - 1; i >= 0; i--){
            rights[i] = right * nums[i];
            right = rights[i];
        }
        
        res[0] = rights[1];
        res[nums.length - 1] = lefts[nums.length - 2];
        for(int i = 1; i < nums.length - 1; i++){
            res[i] = lefts[i - 1] * rights[i + 1];
        }
        
        return res;
    }
}