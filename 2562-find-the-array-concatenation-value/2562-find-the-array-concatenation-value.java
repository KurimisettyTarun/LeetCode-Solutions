class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int st=0;
        int end =nums.length-1;
        long res =0;
        while(st<end)
        {
            int temp= Integer.parseInt(String.valueOf(nums[st++])+String.valueOf(nums[end--]));
            res+=temp;
        }
        int len = nums.length;
        return len%2==0?res:res+nums[len/2];
    }
}