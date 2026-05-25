class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        List<Character> chars = new LinkedList<>(map.keySet());
        
        chars.sort((a,b)-> map.get(b)-map.get(a));
        StringBuilder sb = new StringBuilder();

        for(char c: chars)
        {
            int cnt = map.get(c);
            for(int i=0; i<cnt;i++)
            {
                sb.append(String.valueOf(c));
            }
        }

        return sb.toString();
    }
}