class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String res = "";

        for (int i = 1; i <= str2.length(); i++) {
            String s = str2.substring(0, i);

            if (divides(str1, s) && divides(str2, s)) {
                res = s;
            }
        }

        return res;
    }

    private boolean divides(String str, String pattern) {
        if (str.length() % pattern.length() != 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder();

        int times = str.length() / pattern.length();

        for (int i = 0; i < times; i++) {
            sb.append(pattern);
        }

        return sb.toString().equals(str);
    }
}