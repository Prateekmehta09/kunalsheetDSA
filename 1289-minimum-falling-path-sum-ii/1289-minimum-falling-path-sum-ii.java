class Solution {
    public int minFallingPathSum(int[][] grid) {
      int[][] dp=new int[grid.length+1][grid.length+2];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        return f(0,grid,-1,dp);
    }
    public static int f(int lvl,int[][] grid,int prev,int[][] dp){
        if(lvl==grid.length){
            return 0;
        }
        if(dp[lvl][prev+1]!=-1) return dp[lvl][prev+1];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            if(i!=prev){
                int sum=grid[lvl][i]+f(lvl+1,grid,i,dp);
                min=Math.min(sum,min);
            }
        }
        return dp[lvl][prev+1]=(min==Integer.MAX_VALUE ? 0 :min);  
    }
}