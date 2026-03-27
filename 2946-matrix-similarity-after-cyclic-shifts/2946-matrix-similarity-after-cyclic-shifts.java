class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] res = new int[mat.length][];

        for (int i = 0; i < mat.length; i++) {
            res[i] = mat[i].clone(); 
        }    
        int l = mat.length;
        
        for(int i=0;i<l;i++)
        {
            int len=mat[i].length;
            int[]temp=mat[i];

            mat[i]=rotate(temp, k%len, i);
            if(!Arrays.equals(mat[i],res[i]))return false;

        }
        return true;
    }
    
    public int[] rotate(int[] li, int k,int idx){
        int len =li.length;
        if(idx%2==0)
        {
            for(int j=0;j<k;j++){
            int t = li[0];
            for(int i=0;i<len-1;i++)
            {
                li[i]= li[i+1];
            }
            li[len-1]=t;
        }
        }
        else
        {
            for(int j=0;j<k;j++){
            int t = li[len-1];
            for(int i=len-1;i>0;i--)
            {
                li[i]= li[i-1];
            }
            li[0]=t;
            }
        }
        
        return li;
    }


}