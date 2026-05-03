class Solution {
    public int sumOfPrimesInRange(int n) {
        int reversed = Integer.parseInt(
            new StringBuilder(String.valueOf(n)).reverse().toString()
        );

        int max = Math.max(n, reversed);
        int min = Math.min(n, reversed);

        int res = 0;

        for (int i = min; i <= max; i++) {
            res += primeOrZero(i);
        }

        return res;
    }

    public int primeOrZero(int n) {
        if (n <= 1) return 0;

        for (int i = 2; i<= n/2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return n;
}
}