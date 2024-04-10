class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        int[] result=new int[n];
        boolean skip=false;
        int indindeck=0;
        int indinresult=0;
        
        Arrays.sort(deck);
        
        while(indindeck<n)
        {
            if(result[indinresult]==0)
            {
                if(!skip)
                {
                    result[indinresult]=deck[indindeck];
                    indindeck++;
                }
                skip=!skip;
            }
            indinresult=(indinresult+1)%n;
        }
        return result;
    }
}