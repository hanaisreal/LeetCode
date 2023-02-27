class Solution {
    public int[] twoSum(int[] nums, int target) {
        //make hashmap
        //iterate through each element, required num = goal sum - current number
        //if required number DNE in hashmap, add index of current number and 0

        int[] result = new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int requiredNum = target - nums[i];
            if( hashmap.containsKey(requiredNum)){
                result[0] = i;
                result[1] = hashmap.get(requiredNum);
                return result;
            }else{
                hashmap.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}