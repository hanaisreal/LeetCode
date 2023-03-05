class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        
        int outBound = -1;
        int lastMin = -1, lastMax = -1;
        long result = 0;
    
        for (int i = 0; i < nums.length; i++){
            
            if(nums[i] >= minK && nums[i] <= maxK){
                lastMin = (nums[i] == minK) ? i : lastMin;
                lastMax = (nums[i] == maxK) ? i : lastMax;
                result += Math.max(0, Math.min(lastMin, lastMax) - outBound);
            }
            else{
                outBound = i;
                lastMin = -1;
                lastMax = -1;
            }
        }
        
        return result;
    }
}