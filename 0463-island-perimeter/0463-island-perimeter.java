class Solution {
    public int islandPerimeter(int[][] grid) {
         int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4 - (getVal(grid, i - 1, j)
                            + getVal(grid, i + 1, j)
                            + getVal(grid, i, j + 1)
                            + getVal(grid, i, j - 1));
                }
            }
        }
        return perimeter;
    }

    public int getVal(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length) {
            return grid[i][j];
        }
        return 0;
    }
}