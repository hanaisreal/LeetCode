class Solution {
    public boolean isPalindrome(int x) {

        //if the number is negative, it is not a palindrome
        if(x < 0){
            return false;
        }
        if( x == 0) {
            return true;
        }

        String num = Integer.toString(x);

        for(int i = 0, j = num.length()-1; i < num.length()/2; i++, j--){
            if(num.charAt(i) != num.charAt(j)){
                return false;
            }
        }

        return true;
    }
}