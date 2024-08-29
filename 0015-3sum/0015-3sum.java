class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = nums.length - 1; i > 1; i--){
            int target = 0 - nums[i];
            int left = 0;
            int right = i - 1;
            while(left < right && i > 1){
                if(nums[left] + nums[right] == target){
                    List<Integer> set = List.of(nums[left], nums[right], nums[i]);
                    list.add(set);
                    int curLeft = nums[left];
                    int curRight = nums[right];
                    while(nums[left] == curLeft && left < right){
                        left++;
                    }
                    while(nums[right] == curRight && right > left){
                        right--;
                    }
                    while(nums[i - 1] == nums[i] && i > 1){
                        i--;
                    }
                }
                else if(nums[left] + nums[right] < target){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return list;
    }
}