class Solution {
    public int[][] generateMatrix(int n) {
        //define variables left right top bottom and num. 
        //in each iteration, fill in the column corresponding to the matrix index
        
        if(n == 0) return new int[0][0];
        
        
        int[][] matrix = new int[n][n];
        int left = 0, right = n-1, top = 0, bottom = n-1, num = 1;
        
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                matrix[top][i] = num++;
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = num++;
            }
            right--;
            
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = num++;
            }
            bottom--;
            
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }
}