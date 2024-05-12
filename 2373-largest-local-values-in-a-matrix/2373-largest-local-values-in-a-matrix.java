class Solution {
    public int[][] largestLocal(int[][] grid) {
        int N=grid.length;
        int[][] maxlocal=new int[N-2][N-2];
        for(int i=0;i<N-2;i++)
        {
            for(int j=0;j<N-2;j++)
            {
                maxlocal[i][j]=findmax(grid,i,j);
            }
        }
        return maxlocal;
    }
    public int findmax(int[][] grid,int  x,int y){
        int maxel=0;
        for(int i=x;i<x+3;i++)
        {
            for(int j=y;j<y+3;j++)
            {
                maxel=Math.max(maxel,grid[i][j]);
            }
        }
        return maxel;
    }
}