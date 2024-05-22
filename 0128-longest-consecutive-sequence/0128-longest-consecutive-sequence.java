class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 1, temp = 1, cur = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == cur) continue;
            if(nums[i] == cur + 1) {
                temp++;
                max = Math.max(max, temp);
            }
            else{
                max = Math.max(max, temp);
                temp = 1;
            } 
            cur = nums[i];
        }
        return max;
    }
}