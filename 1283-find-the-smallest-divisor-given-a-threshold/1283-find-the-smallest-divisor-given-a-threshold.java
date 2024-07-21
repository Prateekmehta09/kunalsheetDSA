class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
          {
            
            mx = Math.max(mx, nums[i]);
        }
        
        int s=1;
        int e=mx;
      
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(ceil(nums, mid, threshold) == true) {
              
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return s;
    
            
        
    }
     public boolean ceil(int[] nums,int divide, int threshold) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += Math.ceil((double)(nums[i]) /(double)(divide));
        }
        
        if(sum<=threshold)
        {
            return true;
        }
         return false;
    }
    
}