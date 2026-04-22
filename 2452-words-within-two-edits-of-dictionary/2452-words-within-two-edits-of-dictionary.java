class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int lenD = dictionary.length;
        int lenQ = queries.length;
        List<String> res = new ArrayList<>();
        for(String s : queries)
        {
            for(String d : dictionary)
            {
                int count=0;
                for(int i=0;i<d.length();i++){
                if(s.charAt(i)!=d.charAt(i))
                {
                    count++;
                    if(count>2)
                    {
                        break;
                    }
                }    
                }
                 if(count<=2)
                    {
                        res.add(s);
                        break;
                    }
            }
        }
        return res;
    }
}