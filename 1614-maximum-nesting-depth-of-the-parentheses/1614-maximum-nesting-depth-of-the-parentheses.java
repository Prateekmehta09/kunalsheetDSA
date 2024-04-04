class Solution {
    public int maxDepth(String s) {
         char c=')';
        char o='(';
        int count=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            //System.out.println(s.charAt(i));
            if(s.charAt(i)==o)
            {
                count++;
                
                

            }
            if(s.charAt(i)==c)
            {
               
             if(count>max)
            {
                max=count;
              
            }
             count--;
                
            }
          
        }
        return max;
    }
}