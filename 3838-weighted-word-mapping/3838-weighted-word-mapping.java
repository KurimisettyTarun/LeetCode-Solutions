class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

      Map<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            map.put(i, (char)('z' - i));
        }
        StringBuilder sb = new StringBuilder();
        for(String s : words)
        {
            int sum =0;
            for(char c : s.trim().toCharArray())
            {
                int idx = c-'a';

                sum+= weights[idx];
            }
             char le = map.get(sum%26);
                sb.append(String.valueOf(le));
        }
        return sb.toString();
    }
}