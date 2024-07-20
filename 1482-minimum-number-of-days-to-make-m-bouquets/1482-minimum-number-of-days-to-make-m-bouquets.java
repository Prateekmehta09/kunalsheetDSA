class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
         int low=Integer.MAX_VALUE;
         int high=Integer.MIN_VALUE;
         for(int day:bloomDay)
         {
          low=Math.min(low,day);
          high=Math.max(high,day);
         }
        
         if(((long)m*k) > bloomDay.length) 
         {
            return -1;
        }

        while(low <= high) {
            int mid = (low + high) / 2;

            if(possible(bloomDay, mid, m, k) == true) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return low; 
    }
    public boolean possible(int[] bloomDay, int day, int m, int k) 
    {
        int count = 0;
        int ans = 0;
        for(int i=0; i<bloomDay.length; i++) 
        {
            if(bloomDay[i] <= day) 
            {
                count++;
            }
            else 
            {
                ans += (count / k);
                count = 0;
            }
        }
        ans += (count / k);
        return ans >= m;
    }
   
    
}