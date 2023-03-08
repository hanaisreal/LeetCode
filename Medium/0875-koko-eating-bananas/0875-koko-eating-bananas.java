class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       //binary search problem 
        int low = 1;
        int high = Integer.MIN_VALUE;
        
        for(int i = 0;i < piles.length; i++){
            high = Math.max(high,piles[i]); //find the highest value in piles[]
        }
        
        while(low < high){
            int mid = low + (high - low) / 2;
            if(blackbox(mid,piles,h)){
                high=mid;
            }
            else
                low=mid+1;
        }
        return low;
    }
    public boolean blackbox(int maxpiles,int[] piles,int h){
        int hours = 0;
        for(int i : piles){
            int time = i / maxpiles;
            hours += time;
            if(i % maxpiles != 0) hours++;
        }
        if(hours <= h)
            return true;
        
        return false;
    }
}