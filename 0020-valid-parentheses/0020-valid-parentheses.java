class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty() &&  stack.peek() == map.get(s.charAt(i))){
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}