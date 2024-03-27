class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
        {
            return 0;
            
        }
        int totalcount=0;
        int product=1;
        for(int i=0,j=0;j<nums.length;j++)
        {
            product*=nums[j];
            
            while(product>=k)
            {
                product /= nums[i++];

            }
            totalcount+=j-i+1;
            
        }
        return totalcount;
        
    }
}