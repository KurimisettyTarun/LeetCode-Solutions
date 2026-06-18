class Solution {
    public boolean checkGoodInteger(int n) {
        int sum =0;
        int sqSum =0;

        while(n>0)
        {
            int rem = n%10;
            sum+=rem;
            sqSum +=(rem*rem);
            n/=10;
        }
        return sqSum - sum >=50;
    }
}