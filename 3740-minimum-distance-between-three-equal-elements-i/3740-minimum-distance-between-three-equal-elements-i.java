class Solution {
    public int minimumDistance(int[] nums) {
        int res =Integer.MAX_VALUE;
        int len = nums.length;
        for(int i=0; i<len; i++)
        {   
            int one =i;
            int val = nums[i];
            int two=0;
            int three=0;
            int count =0;
            for(int j=i+1; j<len; j++)
            {
                if(nums[j]==val && count==0) 
                {
                    two = j;
                    count++;
                }
                else if(nums[j]==val && count==1)
                {
                    three = j;
                    count++;
                }
                if(count==2)
                {
                    int ans = Math.abs(one-two)+Math.abs(two-three)+Math.abs(three-one);
                    res=Math.min(res,ans);
                    count=0;
                    break;
                } 
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}