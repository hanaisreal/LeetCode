class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> stack = new Stack<>();  
   for (int asteroid : asteroids) {
            boolean flag = true;
            while (!stack.isEmpty() && (stack.peek() > 0 && asteroid < 0)) {
                // If the top asteroid in the stack is smaller, then it will explode.
                // Hence pop it from the stack, also continue with the next asteroid in the stack.
                if (Math.abs(stack.peek()) < Math.abs(asteroid)) {
                    stack.pop();
                    continue;
                }
                // If both asteroids have the same size, then both asteroids will explode.
                // Pop the asteroid from the stack; also, we won't push the current asteroid to the stack.
                else if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    stack.pop();
                }

                // If we reach here, the current asteroid will be destroyed
                // Hence, we should not add it to the stack
                flag = false;
                break;
            }

            if (flag) {
                stack.push(asteroid);
            }
        }
    
   
    int[] ans=new int[stack.size()];
    for(int i=ans.length-1;i>=0;i--){
        ans[i]=stack.pop();
    }

return ans;
        
    }
}