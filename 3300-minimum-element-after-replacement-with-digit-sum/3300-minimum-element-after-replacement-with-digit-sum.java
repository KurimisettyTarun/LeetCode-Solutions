class Solution {
    public int minElement(int[] nums) {
        for(int i=0; i<nums.length; i++)
        {
            nums[i] = sum(nums[i]);
        }

        return Arrays.stream(nums).min().orElse(0);
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