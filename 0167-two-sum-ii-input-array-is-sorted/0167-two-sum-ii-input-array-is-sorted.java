class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st = 0;
        int end = (numbers.length)-1;
        int[] res=new int[2];
        while(st<end)
        {
            int sum= numbers[end]+ numbers[st];
            if(sum==target)return new int[]{st+1,end+1};
            else if(sum<target)
            {
                st++;
            }
            else{
           end--;
            }
        }
        return res;
    }
}