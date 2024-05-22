class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num:nums) 
            counts.merge(num, 1, Integer::sum);
        List<Integer> [] buckets = new ArrayList[nums.length];

        for(Integer key: counts.keySet()){
            int count = counts.get(key);
            if(buckets[count - 1] == null)
                buckets[count - 1] = new ArrayList<>();
            buckets[count - 1].add(key);
        }
        int [] out = new int [k];
        int index = 0;
        for(int i = buckets.length - 1; i >= 0; i--){
            if(buckets[i] != null){
                for(int num: buckets[i]){
                    out[index++] = num;
                    if(index == k) return out;
                }
            }
        }
        return out;
    }
}