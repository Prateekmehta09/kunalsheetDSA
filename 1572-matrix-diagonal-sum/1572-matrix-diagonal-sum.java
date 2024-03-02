class Solution {
    public int diagonalSum(int[][] mat) {
//          int sum = 0;
//         int i = 0;
//         int j = mat[0].length-1;
//         for(int k=0; k<mat.length; k++){
//                 if(i==j) sum += mat[k][i];
//                 else{   
//                     int temp = mat[k][i] + mat[k][j];
//                     sum += temp;
//                     }
//                 i++;
//                 j--;
//             }
//         return sum;
        
//     }
        int n=mat.length;
        int sol=0;
        
        for(int i=0;i<n;i++)
        {
            sol+=mat[i][i];//for primary diagonal
            sol+=mat[n-1-i][i];// for secondary diagonal
        }
        if(n%2!=0)
        {
            sol-=mat[n/2][n/2];
        }
        return sol;
    }
}