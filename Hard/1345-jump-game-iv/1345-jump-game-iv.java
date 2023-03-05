class Solution {
    public int minJumps(int[] arr) {
        
        int len = arr.length;
        if(len == 1) return 0;
        
        HashMap<Integer, List<Integer>> map = new HashMap<>(); //store number, list of index that the number can move to
        
        for(int i = 0; i < len; i++){
            if( !map.containsKey(arr[i])){  //create a new one if number DNE in map
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(arr[i], temp);
            }else{
                List<Integer> temp = map.get(arr[i]);
                temp.add(i);
                map.put(arr[i], temp);
            }
        }
        
        boolean visit[] = new boolean[len];
        visit[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        
        int steps = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int currIdx = queue.poll();
                
                if(currIdx == len-1) {//reached the need of arr
                    return steps;
                }
                
                List<Integer> jumptoIdxs = map.get(arr[currIdx]);
                jumptoIdxs.add(currIdx + 1);
                jumptoIdxs.add(currIdx - 1);
                
                for(int q: jumptoIdxs){
                    if( q >= 0 && q < len && !visit[q]){
                        visit[q] = true;
                        queue.add(q);
                    }
                }
                jumptoIdxs.clear();  //without this, time limit exceeded occurs. 
            }
            steps++;
        }
        return -1;
    }
}