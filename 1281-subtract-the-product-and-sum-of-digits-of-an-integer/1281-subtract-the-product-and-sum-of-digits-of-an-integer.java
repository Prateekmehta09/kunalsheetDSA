class Solution {
    public int subtractProductAndSum(int n)
    {
       int p= product(n,1);
       int s= sum(n);
        return p-s;
    }
    int product(int n,int p){
      
        while(n!=0)
        {
            int r=n%10;
           
            p=p*r;
            n=n/10;
        }
        return p;
       
        
    }
    int sum(int n)
    {
        int s=0;
         while(n!=0)
        {
            int r=n%10;
           
           s=s+r;
            n=n/10;
        }
        return s;
    }
}
