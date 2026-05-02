class Solution {
    public int rotatedDigits(int n) {
        int res =0;

        for(int i=1; i<=n; i++)
        {
            if(check(i))
            {
                res++;
            }
        }
        return res;
    }

    boolean check(int num){
        boolean res=false;
        while(num>0)
        {
            int rem = num%10;
            if(rem==3 || rem==4 || rem ==7 )
            {
                return false;
            }
            else if(rem==2 || rem==5 || rem == 6|| rem ==9)
            {
                res=true;
            }
            num/=10;
        }
        return res;
    }
}