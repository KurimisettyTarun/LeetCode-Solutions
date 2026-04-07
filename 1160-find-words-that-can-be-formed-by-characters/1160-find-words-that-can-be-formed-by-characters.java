class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (String s : words) {
            Map<Character, Integer> word = new HashMap<>();
            for (char ch : s.toCharArray()) {
                word.put(ch, word.getOrDefault(ch, 0) + 1);
            }

            boolean canForm = true;

            for (char c : word.keySet()) {
                if (!map.containsKey(c) || word.get(c) > map.get(c)) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                res += s.length();
            }

        }
        return res;
    }
}