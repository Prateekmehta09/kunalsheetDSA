class Solution {
    public int[][] findFarmland(int[][] land) {
         int m = land.length, n = land[0].length;
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int row = i, col = j;
                    while (row + 1 < m && land[row + 1][col] == 1) {
                        row++;
                    }
                    while (col + 1 < n && land[row][col + 1] == 1) {
                        col++;
                    }
                    int[] farm = new int[]{i, j, row, col};
                    result.add(farm);
                    visited(i, j, row + 1, col + 1, land);
                }
            }
        }
        return result.toArray(new int[0][]);
    }
     private void visited(int r, int c, int rEnd, int cEnd, int[][] land) {
        for (int i = r; i < land.length && i < rEnd; i++) {
            for (int j = c; j < land[0].length && land[i][j] == 1 && j < cEnd; j++) {
                land[i][j] = 0;
            }
        }
    
}
}