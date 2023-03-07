class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        
        long low = Long.MAX_VALUE;
        long high = 0;
        for(int it : time){ //finding min num
            low = Math.min(low,it);
        }
        high = totalTrips*low;  //high would be the maximum time taken for all low to be considered. 
        
        while(low < high){
            long mid = low + (high - low) / 2;
            
            if(numTrips(mid,totalTrips,time)){
                high = mid;
            }
            else
                low = mid + 1;
        }
        return low;
    }
    public boolean numTrips(long isvalidtime,int totalTrips,int[] time){
        long trips = 0;
        
        for(int it : time){
            trips += isvalidtime / it;
        }
        if(trips >= totalTrips)
            return true;
        return false;
    }
}
