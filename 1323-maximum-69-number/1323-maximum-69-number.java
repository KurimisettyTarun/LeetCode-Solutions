class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        int res=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)-'0'==6&& count==0)
            {
                res=(res*10)+(s.charAt(i)-'0');
                res+=3;
                count++;
            }
            else
            res=(res*10)+(s.charAt(i)-'0');
        }
        return res;
    }
}