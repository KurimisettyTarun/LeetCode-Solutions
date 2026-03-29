class Solution {
    public int firstMatchingIndex(String s) {
        int l = 0;
        int r = s.length()-1;
        int end = (r/2)+1;
        while(l<=end)
        {
            if(s.charAt(l)==s.charAt(r))return l;
            else
            {
                l++;
                r--;
            }
        }
        return -1;
    }
}