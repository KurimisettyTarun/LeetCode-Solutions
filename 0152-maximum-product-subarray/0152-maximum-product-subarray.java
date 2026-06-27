class Solution {
    public int maxProduct(int[] nums) {

        int prefix = 1;
        int suffix = 1;

        int n = nums.length;

        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > ans) {
                ans = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix *= nums[i];

            ans = Math.max(ans, prefix);
        }

        return ans;
    }
}