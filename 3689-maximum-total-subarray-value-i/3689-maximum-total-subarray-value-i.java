class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : nums)
        {
            if(i<=min)
            {
                min=i;
            }
            if(i>=max){
                max=i;
            }
        }
        long res=0;
        for(int i=0; i<k; i++)
        {
            res+=(max-min);
        }
        return res;
    }
}