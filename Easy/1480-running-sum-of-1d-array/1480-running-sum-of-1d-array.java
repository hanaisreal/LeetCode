class Solution {
    public int[] runningSum(int[] nums) {
        int prevSum = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = prevSum + nums[i];
            prevSum += nums[i];
        }
        
        return ans;
    }
}