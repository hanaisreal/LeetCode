class Solution {
    public boolean isValid(String s) {
        //stack the bracket if it is openning 
        //if met closing bracket, check if the stack's top is openning bracket. if yes, pop. if no, return false
        
        Stack<Character> stack = new Stack<Character>();
        
        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    // If it is, pop the opening bracket from the stack
                    stack.pop();
                } else { // Otherwise, the brackets don't match, so return false
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
        
    }
}