class SmallestInfiniteSet {

    private Integer minNum;
    private PriorityQueue<Integer> heap;
    
    public SmallestInfiniteSet() {
        //contain all positive integers
        minNum = 1;
        heap = new PriorityQueue<>();
    }
    
    public int popSmallest() {
        //returns the smallest integer contained in the infinite set
        if(!heap.isEmpty()){
            return heap.poll();
        }
        minNum++;
        return minNum - 1;
    }
    
    public void addBack(int num) {
        //adds a positive integer num back into the infinite set, if it is not already in the infinite set. 
        if(minNum > num && !heap.contains(num)){
            heap.offer(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */