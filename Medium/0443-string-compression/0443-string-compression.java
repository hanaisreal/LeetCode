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
            while(i+1<n && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            if(count==1){
                chars[j++]=charac;
            }
            else{
                if(count>1){
                    chars[j++]=charac;
                    String counterstring=count+"";
                    for(int r=0;r<counterstring.length();r++){
                        chars[j++]=counterstring.charAt(r);
                    }
                }
            }
            i++;
        }
        return j;
    }
}