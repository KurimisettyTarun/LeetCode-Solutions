class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++)
        {
            int l = s.charAt(i)-'0';
            int r = s.charAt(i-1)-'0';
            sum+=Math.abs(l-r);
        }
        return sum;
    }
}