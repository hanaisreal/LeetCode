class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int mx = 0, min = time[0];
        for(int t : time){
            mx = Math.max(t, mx);
            min = Math.min(t, min);
        }
        long totalAtMx = 0;
        for(int t : time){
            totalAtMx += mx/t;
        }
        
        long k = totalTrips/totalAtMx;
        long remainder = totalTrips%totalAtMx;
        if(remainder != 0) k++;
        
        

        long l = min, r = mx*k;
        while(l <= r){
            long mid = l + (r-l)/2;
            long currTotal = getTotal(time, mid);
            if(currTotal < totalTrips){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return l;
    }
    
    int getTotal(int[] time, long budget){
        int ret = 0;
        for(int t : time){
            ret += (budget/t);
        }
        return ret;
    }
}