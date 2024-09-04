class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) {
            return s.length();
        }
        int max = 0;
        int temp = 0;
        int l = 0;
        int r = 0;
        HashSet<Character> set = new HashSet<>();
        while(r < s.length()){
            char c = s.charAt(r);
            if(!set.contains(c)){
                set.add(c);
                r++;
                temp++;
            }
            else{
                if (temp > max){
                    max = temp;
                }
                while(set.contains(c)){
                    set.remove(s.charAt(l));
                    l++;
                    temp--;
                }
            }
            if (r == s.length()){
                if(temp > max){
                    return temp;
                }
                else {
                    return max;
                }
            }
        }
        return max;
    }
}