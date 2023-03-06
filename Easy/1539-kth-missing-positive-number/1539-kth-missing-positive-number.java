class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        List<Integer> list = new ArrayList<>();
        
        int number = 1;
        int idx = 0;
        
        while(true){
            
            if(number != arr[idx]){
                list.add(number);
            }else{
                idx++;   
            }
            number++;
            
            if(idx >= arr.length) break;
        }
        
        if(k <= list.size()){
            return list.get(k-1);
        }else{
            int num = k - list.size();
            return arr[arr.length-1] + num;
        }
        
        
    }
}