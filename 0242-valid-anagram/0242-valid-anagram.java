class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] chars = new int [26];
        for(int i = 0; i < s.length(); i++){
            chars[(int) s.charAt(i) - 'a']++;
            chars[(int) t.charAt(i) - 'a']--;
        }
        for(int i : chars) if(i != 0) return false;
        return true;
    }
}