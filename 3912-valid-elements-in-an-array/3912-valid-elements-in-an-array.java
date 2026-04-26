class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {

            if (i == 0 || i == len - 1) {
                res.add(nums[i]);
                continue;
            }

            int t = nums[i];
            boolean leftValid = true;
            boolean rightValid = true;

            for (int j = 0; j < i; j++) {
                if (nums[j] >= t) {
                    leftValid = false;
                    break;
                }
            }

            for (int j = i + 1; j < len; j++) {
                if (nums[j] >= t) {
                    rightValid = false;
                    break;
                }
            }

            if (leftValid || rightValid) {
                res.add(t);
            }
        }

        return res;
    }
}