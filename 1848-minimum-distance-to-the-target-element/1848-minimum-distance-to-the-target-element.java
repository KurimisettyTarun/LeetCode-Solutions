class Solution {
    public int getMinDistance(int[] nums, int target, int st) {
        int min =Integer.MAX_VALUE;
     for(int i=nums.length-1;i>=0;i--)
     {
        if(nums[i]==target)
        {
            min=Math.min(min, Math.abs(st-i));
        }
     } 
       return min;
    }
}