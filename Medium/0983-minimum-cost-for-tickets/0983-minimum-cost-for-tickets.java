class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        //dynamic programming:
        
        //initialize an array dp of size n+1, where n is the length of the array
        //this dp array stores the minimum cost to travel up to i-th day
        
        //if 1 day pass is bought, cost: dp[i-1] + costs[0];
        //if 7 day pass, cost: dp[j+1] + costs[1]; such that the difference between two days is less than 7
        //if 30 day pass, look for the first day before the i-th day, such that the difference between between two days is less than 30, let that day be j. then, cost: dp[j+1] + costs[2];
        
        int n = days.length;
        int[] dp = new int[ n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i = 1; i <= n; i++){
            //1 day pass for current day
            dp[i] = dp[i-1] + costs[0];
            
            int j = i - 1;
            while(j >= 0 && days[i-1] - days[j] < 7) j--;
            dp[i] = Math.min(dp[i], dp[j + 1] + costs[1]);
            
            j = i - 1;
            while( j >= 0 && days[i-1] - days[j] < 30) j--;
            dp[i] = Math.min(dp[i], dp[j + 1] + costs[2]);
            
        }
        
        return dp[n];
        
        
    }
}