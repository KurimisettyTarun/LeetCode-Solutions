class Solution {
    public boolean consecutiveSetBits(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;

        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i)=='1' && binary.charAt(i-1)=='1') {
                count++;
            }
        }

        return count == 1;
    }
}