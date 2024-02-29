class Solution {
    public int largestAltitude(int[] gain) 
    {
        int ans=0;
        int maxi=0;
        for(int i=0;i<gain.length;i++)
        {
            maxi=maxi+gain[i];
            ans=Math.max(maxi,ans);
        }
        return ans;
    }
}