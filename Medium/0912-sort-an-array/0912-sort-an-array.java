class Solution {


    public int[] sortArray(int[] nums) {
        //bubble sort better than selection sort, but worst case both will be n^2
        //try merge sort = n(log(n))
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right){
        if(left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right){
        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }

        while(j <= right) {
            temp[k++] = nums[j++];
        }

        for (int p = 0; p <k; p++){
            nums[left + p] = temp[p];
        }
    }
}