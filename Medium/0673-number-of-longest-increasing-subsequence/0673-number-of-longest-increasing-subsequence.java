class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        
        int maxLength = 1;
        
        //step1. initialize the dp and count arrays with 1 as each element is a valid subsequence of length == 1
        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(count, 1);
        
        //step 2. for each element at index i in the input array, iterate through all elements before it. index j from 0 to i-1
        //step 3. compare the values of nums[i] and nums[j]
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    if(dp[j] + 1 > dp[i]){
                        dp[i] = dp[j]+1;
                        count[i] = count[j];
                    }
                    else if (dp[j] + 1 == dp[i]){
                    count[i] += count[j];
                    }
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        
        int result = 0;
        for(int i = 0; i < n; i++){
            if(dp[i] == maxLength){
                result += count[i];
            }
        }
        return result; 
        
    }
}