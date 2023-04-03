class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //need to meet where people's weight <= limit && maximum 2 people
        //step1: sort the array in increasing order
        //step2: make two pointer, one on the left, one the right, add them to see if it exceeds the limit
        //step3: if it exceeds the limit, increase count and move the right pointer down by 1
        //step4: repeat the step until right == left pointer
        
        Arrays.sort(people);
        int left = 0;
        int right = people.length -1;
        int count = 0;
        while(left <= right){
            if(people[left] + people[right] > limit){
                count++;
                right--;
            }else{
                left++;
                right--;
                count++;
            }
        }
        return count;
    }
}