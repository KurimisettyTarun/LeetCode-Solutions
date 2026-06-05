class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) return word;
        
        String s = new StringBuilder(word.substring(0, idx + 1)).reverse().toString();
        String s2 = word.substring(idx + 1);

        return s + s2;
    }
}