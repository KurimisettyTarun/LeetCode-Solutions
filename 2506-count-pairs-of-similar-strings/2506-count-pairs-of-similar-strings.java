class Solution {
    public int similarPairs(String[] words) {
        int len= words.length;
        int res =0;

        for(int i=0;i<len;i++)
        {
            Set<Character> fWord = new HashSet<>();
            for(char c :words[i].toCharArray())
            {
                fWord.add(c);
            }
            for(int j=i+1;j<len;j++)
            {
                Set<Character> sWord = new HashSet<>();
                for(char c:words[j].toCharArray())
                {
                    sWord.add(c);
                }
                if(fWord.equals(sWord)){
                    res++;
                }
            }
        }
        return res;
    }
}