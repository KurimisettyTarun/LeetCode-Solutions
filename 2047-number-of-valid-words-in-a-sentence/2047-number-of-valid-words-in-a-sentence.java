class Solution {
    public int countValidWords(String sentence) {

        String[] tokens = sentence.trim().split("\\s+");
        int res = 0;
        for(String s : tokens)
        {
            if(validToken(s))
            {
                res++;
            }
        }
        return res;
    }
    public boolean validToken(String s)
    {
        char[] c = s.toCharArray();
        int hyphenCount =0;
        for(int i=0; i<c.length; i++)
        {

            char ch = c[i];
            if(Character.isDigit(ch))
            return false;
            
            if(ch == '-' ){
                hyphenCount++;
                if(hyphenCount ==2)
                return false;
                if (i == 0 || i == s.length() - 1)
                    return false;
                
                if(!Character.isLowerCase(c[i-1]) || !Character.isLowerCase(c[i+1]))
                return false;
            }
         
            if(ch=='!' || ch == '.' || ch == ',')
            {
                if(i!=c.length-1)
                return false;
            }
        }
        return true;
    }
}