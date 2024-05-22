class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] out = new int [k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums) 
            map.merge(num, 1, Integer::sum);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        pq.addAll(map.entrySet());
        
        while(pq.size() > k) pq.poll();
        
        for(int i = 0; i < k; i++){
            out[i] = pq.poll().getKey();
        }
    return out;
    }
}