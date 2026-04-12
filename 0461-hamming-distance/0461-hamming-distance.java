class Solution {
    public int hammingDistance(int x, int y) {

        int z = Math.max(x, y);  // bigger
        String mx = Integer.toBinaryString(z);

        // pad both using max length
        String t1 = String.format("%" + mx.length() + "s", Integer.toBinaryString(x)).replace(' ', '0');
        String t2 = String.format("%" + mx.length() + "s", Integer.toBinaryString(y)).replace(' ', '0');

        int ct = 0;

        for (int i = 0; i < mx.length(); i++) {
            if (t1.charAt(i) != t2.charAt(i)) ct++;
        }

        return ct;
    }
}