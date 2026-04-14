class Solution {
    public int[] findDegrees(int[][] matrix) {
        int len = matrix.length;
        int[] res = new int[len];
        for(int i=0;i<len;i++)
        {
            int temp=0;
            for(int j=0;j<len;j++)
                 temp += matrix[i][j];
            res[i]=temp;
        }
        return res;
    }
}