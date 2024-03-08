class Solution {
    public List<Integer> luckyNumbers (int[][] matrix)
    {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int minidx=0;
            int min=99999999;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    minidx=j;
                }
            }
            boolean istrue=true;
            for(int col=0;col<matrix.length;col++){
                if(matrix[i][minidx]<matrix[col][minidx])
                {
                    istrue=false;
                    break;
                }
            }
            if(istrue)
            {
                ans.add(matrix[i][minidx]);
            }
        }
        return ans;
    }
}