class Solution {
    public int partitionString(String s) {
        //hashmap approach
        //iterate through the array, store letter if it is not stored in hashmap
        //if the letter repeats, increase the count and clear the hashmap
        
        int idx = 0;
        int count = 0;
        Map<Character,Boolean> map = new HashMap<>();
        
        while( idx < s.length()){
            if(map.containsKey(s.charAt(idx))){
                count++;
                map.clear(); //clear map to start a new substring
            }
            map.put(s.charAt(idx), true); //mark current character as seen
            idx++;
        }
        
        return count + 1; //+1 because we need to count the last substring
        
    }
}