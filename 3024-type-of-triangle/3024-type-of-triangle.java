class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]+nums[1]<=nums[2]||nums[2]+nums[1]<=nums[0]||nums[0]+nums[2]<=nums[1])
        return "none";
        int temp = nums[0];
        if(nums[0]==temp && nums[1]==temp && nums[2]==temp)return "equilateral";
        else if((nums[0]==nums[1] || nums[0]==nums[2])||
                (nums[1]==nums[0] || nums[1]==nums[2])||
                (nums[2]==nums[1] || nums[2]==nums[0])) return "isosceles";
        return "scalene";
    }
}