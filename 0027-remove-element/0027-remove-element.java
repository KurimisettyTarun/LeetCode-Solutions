class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                k++;
                nums[i]=max;
            }
        }
        Arrays.sort(nums);
        return nums.length-k;
    }
}