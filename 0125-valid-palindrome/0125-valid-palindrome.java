class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while(low <= high){
            while(low < s.length() && !(Character.isLetterOrDigit(s.charAt(low)))){
                low++;
            }
            while(high > 0 && !(Character.isLetterOrDigit(s.charAt(high)))){
                high--;
            }
            if(low < s.length() && high > 0 && Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
                return false;
            }
                  low++;
                  high--;
        }
        return true;
    }
}