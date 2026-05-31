class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> used = new HashSet<>();

        String[] split = s.split("\\s+");

        if (pattern.length() != split.length) return false;

        for (int i = 0; i < split.length; i++) {
            char key = pattern.charAt(i);
            String value = split[i];

            if (map.containsKey(key)) {
                if (!map.get(key).equals(value)) {
                    return false;
                }
            } else {
                if (used.contains(value)) {
                    return false;
                }

                map.put(key, value);
                used.add(value);
            }
        }

        return true;
    }
}