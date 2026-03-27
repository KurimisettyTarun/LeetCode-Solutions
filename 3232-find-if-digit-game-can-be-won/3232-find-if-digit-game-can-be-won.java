class Solution {
    public boolean canAliceWin(int[] nums) {
        int sSum=0;
        int dSum=0;

        for(int i:nums)
        {
            if(i>9)
            dSum+=i;
            else
            sSum+=i;
        }

        return dSum!=sSum;
    }
}