class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        
        int countone=0;
        for(int i=0;i<n;i++)
        {
            countone+=s.charAt(i)-'0';
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<countone-1;i++)
        {
            sb.append("1");
            
        }
        for(int i=0;i<n-countone;i++)
        {
            sb.append("0");
        }
        sb.append("1");
        
        return sb.toString();
    }
}