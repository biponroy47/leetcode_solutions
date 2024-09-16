class Solution {
    public int rearrangeCharacters(String s, String target) {
        
        int [] chars = new int [26];
        for(int i = 0; i < s.length(); i++){
            chars[s.charAt(i) - 97]++;
        }
        int out = 0;
        int iter = 0;
        int i = 0;

        while(chars[target.charAt(i) - 97] > 0){
            //System.out.println(i);
            chars[target.charAt(i) - 97]--;
            i++;
            System.out.println(i);
            if(i == target.length()) {
                out++;
                i = 0;
            }
        }
        return out;
    }
}