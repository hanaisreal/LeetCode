class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        
        //if the stack is not empty | the top of stack is negative and the current number is positive | current number and top of stack has the same sign(either both positive or negative) --> then, push the number to the stack. 
        for(int i = 0; i < n; i++){
            if(st.size() == 0 || st.peek() < 0 && asteroids[i] > 0 || st.peek() > 0 && asteroids[i] > 0 || st.peek() < 0 && asteroids[i] < 0 ) {
                st.push(asteroids[i]);
            }
            else{  //the top of the stack is positive and the current number is negative
                //use while loop to proceed collision with the number in the stack. 
                
                while(st.size() > 0 && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }
                
                if(st.size() == 0 || st.peek() < 0){
                    st.push(asteroids[i]);
                }else if(st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                }
            }
        }
        
        int[] ans = new int[st.size()];
        int i = st.size() -1;
        while(!st.isEmpty()){
            ans[i] = st.peek();
            i--;
            st.pop();
        }
        return ans;
    }
}