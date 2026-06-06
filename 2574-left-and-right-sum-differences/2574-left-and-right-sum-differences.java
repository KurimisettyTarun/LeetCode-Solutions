class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];

        int t=0;
        for(int i = 0; i<len; i++)
        {
            t+=nums[i];
            prefix[i] = t;
        }
        t=0;
        for(int i = len-1; i>=0; i--)
        {
            t+=nums[i];
            suffix[i]=t;
        }
        for(int i=0; i<len; i++)
        {
            prefix[i]=Math.abs(suffix[i]-prefix[i]);
        }
        return prefix;

    }

    
}