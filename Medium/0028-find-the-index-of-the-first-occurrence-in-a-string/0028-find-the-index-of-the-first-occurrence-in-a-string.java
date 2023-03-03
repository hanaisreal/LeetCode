class Solution {
    public int strStr(String haystack, String needle) {
        //need to check if the string needle is in haystack
        int n = needle.length();
    if (n == 0) {
        return 0;
    }
    int m = haystack.length();
        
    if (m < n) {
        return -1;
    }
    for (int i = 0; i <= m - n; i++) {
        if (haystack.substring(i, i + n).equals(needle)) {
            return i;
        }
    }
    return -1;
    }
}