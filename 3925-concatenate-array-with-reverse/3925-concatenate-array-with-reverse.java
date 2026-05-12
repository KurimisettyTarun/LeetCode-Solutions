class Solution {
    public int[] concatWithReverse(int[] nums) {
        int res[] = new int[nums.length*2];

        int k=0;
        for(int i:nums)
        {
            res[k++] = i;
        } 

        for(int i = nums.length-1; i>=0; i--)
        {
            res[k++]=nums[i];
        }
        return res;
    }
}