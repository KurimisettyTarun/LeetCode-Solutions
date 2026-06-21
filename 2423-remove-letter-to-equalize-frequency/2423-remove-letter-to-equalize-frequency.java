class Solution {
    public boolean equalFrequency(String word) {
        Map<Character,Integer> temp = new HashMap<>();
        for(char c:word.toCharArray())
        {
            temp.put(c,temp.getOrDefault(c,0)+1);
        }
        for(char i : temp.keySet())
        {
            temp.put(i,temp.get(i)-1);
            int val = 0;
            boolean valid = true;
            for(int j : temp.values())
            {
                if(j==0)continue;
                if(val==0)
                {
                    val = j;
                }
                else if(val!=j)
                {
                    valid = false;
                    break;
                }
            }
            if(valid) return true;
            temp.put(i,temp.get(i)+1);
        }
        return false;
        
    }
}