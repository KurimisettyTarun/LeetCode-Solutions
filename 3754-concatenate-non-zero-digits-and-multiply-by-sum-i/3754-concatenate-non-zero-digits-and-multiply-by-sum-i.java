class Solution {
    public long sumAndMultiply(int n) {
        long res = 0;
        int sum = 0;

        String num = String.valueOf(n);
        for(char c:num.toCharArray())
        {
            if(c=='0')
            continue;
            else{
            sum+=(c-'0');
            res =(res*10)+(c-'0');
            }
        }
        return sum*res;
    }
}