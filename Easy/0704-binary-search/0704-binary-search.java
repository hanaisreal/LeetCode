class Solution {
    public int search(int[] nums, int target) {
        //binary search
        
        //find the mid num, if the number is smaller than mid, do search on the left side
       
        int left = 0; 
        int right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
        
    }
    
}