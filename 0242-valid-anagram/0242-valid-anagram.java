class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char [] sc = s.toCharArray();
        char [] tc = t.toCharArray();
        int [] chars = new int [26];
        for(char c : sc) chars[c - 'a']++;
        for(char c : tc) chars[c - 'a']--;
        for(int i : chars) if(i != 0) return false;
        return true;
    }
}