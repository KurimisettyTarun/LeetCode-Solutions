class Solution {
    public boolean detectCapitalUse(String word) {
        
        int ct =0;
        if(word.length()==1 )return true;
        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                ct++;
            }
        }
        return ct==word.length() || ct ==0 || (ct == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');
    }
}