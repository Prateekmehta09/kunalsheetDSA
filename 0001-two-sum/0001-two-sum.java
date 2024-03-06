class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        
     HashMap<Integer,Integer> mp=new  HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int cur=nums[i];
            int x=target-cur;
            if(mp.containsKey(x))
            {
                return new int[]{mp.get(x),i};
              
            }  
            mp.put(cur,i);
        }
        return null;
    }

}