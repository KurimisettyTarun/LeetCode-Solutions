class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int sum=0;
        int prod=1;
        while(t>0)
        {
            int rem = t%10;
            sum+=rem;
            prod*=rem;
            t/=10;
        }
        return n%(sum+prod)==0;
    }
}