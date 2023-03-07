class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        long left = 1, right = (long)1e18;
        while (left < right) {
            long mid = left + (right - left) / 2;
            long trips = 0;
            for (int i = 0; i < n; i++) {
                trips += mid / time[i];
                if (trips >= totalTrips) {
                    break;
                }
            }
            if (trips >= totalTrips) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}