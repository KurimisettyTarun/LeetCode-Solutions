class Solution {
    public int similarPairs(String[] words) {
        int len = words.length;
        int res = 0;

        List<Set<Character>> list = new ArrayList<>();

        for (String word : words) {
            Set<Character> set = new HashSet<>();
            for (char c : word.toCharArray()) {
                set.add(c);
            }
            list.add(set);
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (list.get(i).equals(list.get(j))) {
                    res++;
                }
            }
        }

        return res;
    }
}