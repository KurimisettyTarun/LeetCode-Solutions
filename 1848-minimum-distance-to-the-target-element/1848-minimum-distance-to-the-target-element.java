class Solution {
    public int getMinDistance(int[] nums, int target, int st) {
        int min =Integer.MAX_VALUE;
     for(int i=nums.length-1;i>=0;i--)
     {
        if(nums[i]==target)
        {
            int k = Math.abs(st-i);
            // if(min>k)
            // min=k;
            
            min= k<min?k:min;
        }
     } 
       return min;
    }
}