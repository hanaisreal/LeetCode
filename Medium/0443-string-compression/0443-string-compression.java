class Solution {
    public int compress(char[] chars) {
        //if the previous char is the same as the current char, increase count
        //two pointers, count duplicate, if it exceeds 1, then it is compressed
        int i = 0,j=0;
        int n=chars.length;
        
        if(n==1)
            return 1;
        
        while(i<n){
            int count=1;
            char charac=chars[i];
            while(i+1<n && chars[i]==chars[i+1]){  //continue until the numbers aren't duplicated
                count++;
                i++;
            }
            
            if(count==1){  //if the duplication is 1, the next char would be the new char
                chars[j++]=charac; //cover the previous array with new one. 
            }
            else{
                if(count>1){
                    chars[j++]=charac;
                    String counterstring=count+"";
                    for(int r=0;r<counterstring.length();r++){  //incase the count is over 1 digit,
                        chars[j++]=counterstring.charAt(r);  //change the count to string and count digit. 
                    }
                }
            }
            i++;
        }
        return j;
    }
}