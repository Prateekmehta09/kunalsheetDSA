
class Solution {
    public int[] countBits(int n) {
         int[] counts=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            //O(n.logn)
            //counts[i]=Integer.bitCount(i);
            
            //O(n)
            counts[i]=counts[i >> 1] + (i & 1);
            
        }
        return counts;
        
    }
}