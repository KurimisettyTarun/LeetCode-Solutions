class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        int len  = nums.length;
        int temp =nums[0]-nums[len-1];
        if(temp>0)
        {
            for(int j=0;j<len-1;j++)
            {
                if(nums[j]<nums[j+1])return false;
            }
        }
        else
        {
            for(int j=0;j<len-1;j++)
            {
                if(nums[j]>nums[j+1])return false;
            }
        }
        return true;
    }
}