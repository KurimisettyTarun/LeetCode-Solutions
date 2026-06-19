class Solution {
    public int largestAltitude(int[] gain) {
        int [] preSum = new int[gain.length];
        preSum[0] = gain[0];
        for(int i = 1; i<gain.length; i++)
        {
            preSum[i] = preSum[i-1]+gain[i];
        }
        int highest = 0;

        for(int i : preSum)
        {
            highest = Math.max(highest, i);
        }
        return highest;
    }
}