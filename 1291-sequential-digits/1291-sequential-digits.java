class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();

        int maxLen = String.valueOf(high).length();

        for (int len = maxLen; len >= 2; len--) {

            for (int start = 10 - len; start >= 1; start--) {

                int num = 0;

                for (int d = start; d < start + len; d++) {
                    num = num * 10 + d;
                }

                if (num >= low && num <= high) {
                    res.add(num);
                }
            }
        }

        Collections.sort(res);
        return res;
    }
}