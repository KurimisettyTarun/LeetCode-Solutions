class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] copy = nums.clone();   
        int index = 0;

        for (int num : copy) {
            if (num < pivot) {
                nums[index++] = num;
            }
        }

        for (int num : copy) {
            if (num == pivot) {
                nums[index++] = num;
            }
        }

        for (int num : copy) {
            if (num > pivot) {
                nums[index++] = num;
            }
        }

        return nums;
    }
}
