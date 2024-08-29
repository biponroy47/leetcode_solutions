class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        List<List<Integer>> list = new ArrayList<>();

        for(int i = nums.length - 1; i > 1; i--){
            int target = 0 - nums[i];
            int left = 0;
            int right = i - 1;

            while(left < right){
                //System.out.println("l: " + nums[left] + ", r: " + nums[right] + ", target: " + target);
                if(nums[left] + nums[right] == target){
                    List<Integer> set = List.of(nums[left], nums[right], nums[i]);
                    list.add(set);
                    int curLeft = nums[left];
                    while(nums[left] == curLeft && left < right){
                        left++;
                    }
                    int curRight = nums[right];
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
                else if(nums[left] + nums[right] > target){
                    right--;
                }
            }
        }
        return list;
    }
}