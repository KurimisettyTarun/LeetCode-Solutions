class Solution {
    public int maxDistance(int[] colors) {
        
        int res = 0;
        int len =colors.length;
        for(int i=0;i<len;i++){
        int st = i;
        int end =len-1;
        while(st<=end && end>=0)
        {
            if(colors[st]!=colors[end])
            {
                res = Math.max(res, end-st);
                break;
            }
            end--;
        }
        }
        return res;
    }
}