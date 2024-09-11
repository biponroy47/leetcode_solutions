class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a;
        int b;
        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if(token.equals("+")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b + a);
            }
            else if(token.equals("-")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b - a);
            }
            else if(token.equals("*")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b * a);
            }
            else if(token.equals("/")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b / a);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }       
        int out = stack.pop();
        return out;
    }
}

