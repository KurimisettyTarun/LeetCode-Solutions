class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int len = nums.length;
        int left = 0;
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum+=nums[i];

            while(sum>=target)
            {
                min=Math.min(min,i-left+1);
                sum-=nums[left++];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}