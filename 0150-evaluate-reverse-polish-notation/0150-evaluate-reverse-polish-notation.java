class Solution {
    public static boolean isInteger(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if(isInteger(token)){
                stack.push(Integer.parseInt(token));
            }
            else{
                int a = stack.pop();
                int b = stack.pop();
                if(token.equals("+")){
                    stack.push(b + a);
                }
                else if(token.equals("-")){
                    stack.push(b - a);
                }
                else if(token.equals("*")){
                    stack.push(b * a);
                }
                else if(token.equals("/")){
                    stack.push(b / a);
                }
            }
        }
        int out = stack.pop();
        return out;
    }
}

