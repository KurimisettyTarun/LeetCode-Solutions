class Solution {
    public int minDeletion(String s, int k) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        List<Integer> li = new ArrayList<>();
        for (char c : map.keySet())
            li.add(map.get(c));
        Collections.sort(li);
        if (li.size() <= k)
            return res;
        for (int i = 0; i < li.size() - k; i++) {
            res += li.get(i);
        }
        return res;
    }
}