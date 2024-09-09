class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>(3);
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == map.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}