class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int max[]= new int[nums.length];
       int min[]= new int[nums.length];

       max[0]=nums[0];
       for(int i=1; i<nums.length; i++)
       {
            if(max[i-1]>nums[i])
            max[i]=max[i-1];
            else
            max[i]=nums[i];
       }

       min[nums.length-1]= nums[nums.length-1];

       for(int i=nums.length-2; i>=0; i--)
       {
            if(min[i+1]<nums[i])
            min[i]=min[i+1];
            else
            min[i]=nums[i];
       }
       System.out.println(Arrays.toString(max));
       System.out.println(Arrays.toString(min));

      for (int i = 0; i < nums.length; i++)
       {
            if (max[i] - min[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}