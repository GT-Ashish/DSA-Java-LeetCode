class Solution {
    public int arrangeCoins(int n) {
        int copy = n;
        int i;
        for (i = 1; i <= copy; i++) {
            n = n - i;
            if (n == 0) {

                return i;

            } else if (n < 0) {

                return i - 1;

            }
        }
        return i;
    }

}