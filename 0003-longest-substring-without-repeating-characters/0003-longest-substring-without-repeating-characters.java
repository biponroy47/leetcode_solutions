class Solution {
    public int lengthOfLongestSubstring(String s) {

            int max = 0;
            for(int i = 0; i < s.length(); i++){
                HashSet<Character> set = new HashSet<>();
                int temp = 0;
                for(int j = i; j < s.length(); j++){
                    char c = s.charAt(j);
                    if(!set.contains(c)){
                        set.add(c);
                        temp++;
                        if(j == s.length() - 1){
                            if(temp > max){
                                max = temp;
                            }
                        }
                    }
                    else{
                         if(temp > max){
                            max = temp;
                        }
                        break;
                    }
                }
            }
            return max;
    }
}