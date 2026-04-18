class Solution {
    public int[] diStringMatch(String s) {
        int i=0;
        int d =s.length();
        int[] res = new int[d+1];

        for(int j=0; j<s.length();j++)
        {
            if(s.charAt(j)=='I')
            res[j] = i++;
            else
            res[j]= d--;
        }
        res[res.length-1]=i;
        return res;
    }
}