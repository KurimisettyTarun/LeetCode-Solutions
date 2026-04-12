class Solution {
    public int hammingDistance(int x, int y) {

        int z = Math.max(x, y);
        int maxLen = Integer.toBinaryString(z).length();

        String t1 = build(x, maxLen);
        String t2 = build(y, maxLen);

        int ct = 0;

        for (int i = 0; i < maxLen; i++) {
            if (t1.charAt(i) != t2.charAt(i)) ct++;
        }

        return ct;
    }

    private String build(int num, int len) {
        String bin = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();

        for (int i = bin.length(); i < len; i++) {
            sb.append('0');
        }

        sb.append(bin);
        return sb.toString();
    }
}