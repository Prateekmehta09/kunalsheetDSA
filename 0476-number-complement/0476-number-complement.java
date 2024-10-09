class Solution {
    public int findComplement(int num) {
        
         int len = 0;
        int n = num;
        while (n > 0) {
            len++;
            n = n>>1;
        }
        int m = ~((~0)<<len);

        return (~num) & m;  
        
    }
}