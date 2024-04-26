class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int[] dp = new int[26];
        for (int i = 0; i < n; i++) {
            int offset = s.charAt(i) - 'a';
            int tmp = 0;
            for (int j = 0; j < dp.length; j++) {
                if (Math.abs(offset - j) <= k) {
                    tmp = Math.max(tmp, dp[j]);
                }
            }
            dp[offset] = Math.max(dp[offset], tmp + 1);
        }
       
        int ans = 0;
        for (int i : dp) {
            ans = Math.max(ans, i);
        }
        return ans; 
    }
}