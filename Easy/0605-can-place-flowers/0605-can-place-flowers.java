class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed==null) return false;
        if(n==0) return true;
        
        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i]!=1){
                if(i-1>=0 && flowerbed[i-1]!=0) continue;
                if(i+1<flowerbed.length && flowerbed[i+1]!=0) continue;

                flowerbed[i]=1;
                n--;
                
                if(n==0)return true;
            }
        }
        return false;
        
    }
}