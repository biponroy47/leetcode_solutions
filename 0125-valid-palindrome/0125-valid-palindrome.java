class Solution {
    public boolean isPalindrome(String s) {
        String pattern = "["+(char)0 +"-"+(char)47+(char)58+"-"+(char)96+(char)123+"-"+(char)127+"]";
        String input = s.toLowerCase().replaceAll(pattern, "");
        int ptrA = 0;
        int ptrB = input.length() - 1;
        while(ptrA < ptrB && ptrA != ptrB){
            char a = input.charAt(ptrA);
            char b = input.charAt(ptrB);
            if(a == b){
                ptrA++;
                ptrB--;
            }
            else return false;
        }
        return true;
    }
}