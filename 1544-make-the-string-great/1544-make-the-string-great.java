class Solution {
    public String makeGood(String s) {
        
        int i=0,l=s.length();
        while(i<l-1){
            if(s.charAt(i)-s.charAt(i+1)==32||s.charAt(i)-s.charAt(i+1)==-32)
            {
                s=s.substring(0,i)+s.substring(i+2);
                l=s.length();
                i=0;
            }
            else{
                i++;
            }
        }
        return s;
    }
}