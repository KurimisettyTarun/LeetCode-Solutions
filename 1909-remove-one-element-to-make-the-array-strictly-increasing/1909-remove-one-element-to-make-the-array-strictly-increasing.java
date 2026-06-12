class Solution {
    public boolean canBeIncreasing(int[] nums) {
        for(int i =0; i<nums.length; i++)
        {
            if(increasing(nums, i))
            {
                return true;
            }
        }
        return false;
    }
    public boolean increasing (int[] nums, int remove)
    {
        int prev = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            if(i==remove) continue;

            if(nums[i]<=prev)
            return false;

            prev = nums[i];

        }
        return true;
    }
}