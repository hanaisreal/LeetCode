class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList<>();
        
        //greedy approach, check if candies[i] + extraCandies >= maximum in candies[i]
        
        //find max  number of candies
        int max = -1;
        for(int num: candies){
            if(num >= max) {
                max = num;
            }
        }
        
        for(int candy: candies){
            if(candy + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}