class Solution {
    public int numIdenticalPairs(int[] nums) 
    {
        int ans=0;
        int[] arr=new int[101];
        for(int x:nums)
        {
            arr[x]++;
        }
        for(int c:arr)
        {
            ans+=c*(c-1)/2;
        }
        return ans;
        
        
    }
}