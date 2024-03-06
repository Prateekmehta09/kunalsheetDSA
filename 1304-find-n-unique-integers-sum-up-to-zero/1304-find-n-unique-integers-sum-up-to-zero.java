class Solution {
    public int[] sumZero(int n) {
         int mid = n/2;
        int[] arr = new int[n];
        int count=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(i<mid){
                count--;
                arr[i]=count;
            }else if(i==mid && n!=(2*mid)){
                count=0;
                arr[i]=count;
            }else{
                count2++;
                arr[i]=count2;
            }
        }
        return arr;
    }
}