class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=n;
         for(int k=0;j<2*n;k++)
         {
             ans[k]=nums[i];
             k++;
             ans[k]=nums[j];
             j++;
             i++;
         }
         return ans;
    }
}