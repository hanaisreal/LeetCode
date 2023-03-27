class Solution {
    public int minPathSum(int[][] grid) {
        
        //1. initialize table with the top left corner of the grid
        //2. fill the first row of dp table by adding previous left num to current num
        //3. fill the first column of dp table by adding the previous top num to current num
        //4. fill the rest of dp table  by taking minimum of left or up num and add to current num
        //5. return the value in the bottom right corner of the dp table
        
        int n = grid[0].length;  //row
        int m = grid.length; //column
        
        //initialize dp table
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        
        //fill in the first row
        for(int i = 1; i < n; i++){
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        
        //fill in the first column
        for(int i = 1; i < m; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        
        //fill in the rest of dp table
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        
        return dp[m-1][n-1];
    }
}