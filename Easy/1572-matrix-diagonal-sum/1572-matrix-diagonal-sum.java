class Solution {
    public int diagonalSum(int[][] mat) {
        //sum of matrix diagonal
        int n = mat.length;
        int result = 0;
        
        for(int i = 0; i< n; i++){
            result += mat[i][i] + mat[i][n-i-1];  //add two diagonal nums
        }
        
        if(n%2 == 1){  //if odd, the number is added twice
            result -= mat[n/2][n/2];
        }
        
        return result;
        
    }
}