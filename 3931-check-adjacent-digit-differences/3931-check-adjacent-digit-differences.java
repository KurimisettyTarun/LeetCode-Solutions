class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=1; i<s.length(); i++)
        {
            char c1 = s.charAt(i-1);
            char c2 = s.charAt(i);
            int temp = Math.abs((c1-'0') - (c2-'0'));
            if(temp>2)return false;
        }
        return true;
    }
}