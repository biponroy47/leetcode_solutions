class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() < 2) return s.length();
        Queue<Character> queue = new LinkedList<>();
        int max = 0;
        int temp = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!queue.contains(c)){
                queue.add(c);
                temp++;
                if(temp > max) max = temp;
            }
            else {
                while(queue.contains(c)){
                    queue.poll();
                    temp--;
                    i--;
                }
            }
        }
        return max;
    }
}