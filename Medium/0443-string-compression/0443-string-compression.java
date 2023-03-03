class Solution {
    public int compress(char[] chars) {
        //if the previous char is the same as the current char, increase count
        //two pointers, count duplicate, if it exceeds 1, then it is compressed
        
        int i = 0; 
        int j = 0;
        int length = chars.length;
        
        if(length == 1) return 1;
        
        while(i < length){
            int count = 1;
            char charac = chars[i];
            
            while(i < length-1 && chars[i] == chars[i+1]){  //continue until the numbers aren't duplicated
                i++;
                count++;
            }
            
            
            if(count == 1){ //if there is no duplication, no need to add numbers
                chars[j++] = charac;
            }else{
                chars[j++] = charac;
                String countString = count + "";
                for(int k = 0; k < countString.length(); k++){  //in case the count is over 1 digit 
                    chars[j++] = countString.charAt(k);  //change the count to string and add number
                }
            }
            i++; //!! need this so that the next new char is save to charac for comparison
        }
        return j;
    }
}