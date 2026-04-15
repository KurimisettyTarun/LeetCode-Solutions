class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        
        int res = Integer.MAX_VALUE;
        int len = words.length;
        for(int i=0;i<len ;i++)
        {
            if(words[i].equals(target))
            {
               int ans=Math.abs(i - startIndex);
               int dist = Math.min(ans, len - ans); 
               res = Math.min(res,dist);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}