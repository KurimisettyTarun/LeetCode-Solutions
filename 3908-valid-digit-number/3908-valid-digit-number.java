class Solution {
    public boolean validDigit(int n, int x) {
        String a = String.valueOf(n);
        String b = String.valueOf(x);

        if(a.charAt(0)==b.charAt(0))return false;

        return a.contains(b);
    }
}