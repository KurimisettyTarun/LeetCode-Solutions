class Solution {
    public int hIndex(int[] citations) {
        int len =citations.length;
        int res =0;
        for(int i=1;i<=len;i++)
        {
            int count=i;
            int x=0;
            for(int j=0; j<len; j++)
            {
                if(citations[j]>=count)
                {
                    x++;
                }
                if(x>=count)
                {
                    res = count;
                    break;
                }
            }
        }
        return res;
    }
}