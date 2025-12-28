class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length - 1;
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            int left = 0;
            int right = columns;
            while (left <= right) {
                int middle = left + (right - left) / 2;
                if (grid[i][middle] >= 0) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
            sum = sum + (columns - right);

        }

        return sum;
    }
}