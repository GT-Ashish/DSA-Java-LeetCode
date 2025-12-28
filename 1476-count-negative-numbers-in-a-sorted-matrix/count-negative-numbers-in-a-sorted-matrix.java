class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length - 1;
        int j = columns, i, sum = 0;

        for (i = 0; i < rows; i++) {
            while (grid[i][j] < 0 && j - 1 >= 0) {
                j--;
            }

            sum = sum + (columns - j);
            if(grid[i][j] < 0){
                sum += 1;
            }
            

        }
        return sum;

    }
}