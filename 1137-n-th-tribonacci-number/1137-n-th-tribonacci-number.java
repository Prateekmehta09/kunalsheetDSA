class Solution {
    int[] dp;
    public int tribonacci(int n) {
         dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n);  
    }
    int helper(int n){
        if(n==2 || n==1)return 1;
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=helper(n-3)+helper(n-2)+helper(n-1);
    }
}