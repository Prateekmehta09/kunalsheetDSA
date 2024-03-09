class Solution {
    // very easy check hints first then socho ||
    public int minCostToMoveChips(int[] position) 
    {
        int even=0,odd=0;
        for(int el:position)
        {
            if(el%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            
        }
        //hints 3
        
        //Since the first move is free, if all the numbers have the same parity, the answer would be             zero.
        if(even==position.length||odd==position.length)
        {
            return 0;
        }
        return Math.min(even,odd);
    }
}