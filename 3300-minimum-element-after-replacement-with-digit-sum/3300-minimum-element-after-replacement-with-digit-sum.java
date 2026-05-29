class Solution {
    public int minElement(int[] nums) {
        int res= Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            int temp = sum(nums[i]);
            res = Math.min(res,temp);
        }

        return res;
    }

    public int sum(int n){
        int ans=0;
        while(n>0){
            int rem = n%10;
            ans+=rem;
            n/=10;
        }
        return ans;
    }
}