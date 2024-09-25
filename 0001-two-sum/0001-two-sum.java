class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int[] ans=new int[2];
//         ans[0]=ans[1]=-1;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 if(nums[i]+nums[j]==target)
//                 {
//                     ans[0]=i;
//                     ans[1]=j;
//                     return ans;
                    
//                 }
//             }
//         }
//         return ans;
        int n=nums.length;
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int sum=nums[i];
            int more=target-sum;
            if(mp.containsKey(more))
            {
                ans[0]=mp.get(more);
                ans[1]=i;
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
        
    }
}