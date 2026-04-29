class Solution {
    public int dominantIndices(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++)
        {
            int sum =0;
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
            }
            int diff = nums.length-i-1;
            double avg = (double)sum/diff;

            if(avg<nums[i])
            count++;
        }
        return count;
    }
}