class Solution {
    public int mySqrt(int x) {
        int result = 0;
        for (long i = 1; i <= x; i++) {
            if (i * i <= x) {
                result = (int) i;
            } else {
                break;  
            }
        }
        return result;
    }
}