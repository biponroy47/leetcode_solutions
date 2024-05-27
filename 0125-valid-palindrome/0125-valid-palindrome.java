class Solution {
    public boolean isPalindrome(String s) {
        String pattern = "["+(char)0 +"-"+(char)47+(char)58+"-"+(char)96+(char)123+"-"+(char)127+"]";
        String input = s.toLowerCase().replaceAll(pattern, "");
        int ptrA = 0;
        int ptrB = input.length() - 1;
        while(ptrA < ptrB){
            if(input.charAt(ptrA) == input.charAt(ptrB)){
                ptrA++;
                ptrB--;
            }
            else return false;
        }
        return true;
    }
}