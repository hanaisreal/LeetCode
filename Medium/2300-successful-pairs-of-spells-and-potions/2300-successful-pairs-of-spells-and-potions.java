class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        //sort the portion array by increasing number
        //using binary search to find the index of smallest number that is successful
        //then, postions.length - index of first successful smallest number ==> put into the output array
        
        Arrays.sort(potions);
        int[] result = new int[spells.length];
        
        for(int i = 0; i < spells.length; i++){
            int left = 0;
            int right = potions.length - 1;
            while(left <= right){
                int mid = left + (right - left)/2;
                long product = potions[mid] * (long) spells[i];
                if(product >= success){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            result[i] = potions.length - left;
        }
        
        return result;
    }
}