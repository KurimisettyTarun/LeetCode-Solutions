class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        int len  = nums.length;
        int temp =0;
        while(true)
        {
            if(i>=len-1)return true;
            if(nums[i]!=nums[i+1] )
            {
                temp=nums[i]-nums[i+1];
                break;
            }
            i++;
        }
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