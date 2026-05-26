class Solution {
    public int numberOfSpecialChars(String word) {

        Set<Character> set = new HashSet<>();
        for(char c : word.toCharArray())
        set.add(c);

        int cnt = 0;
        for(char i : word.toCharArray())
        {
            char up =Character.toUpperCase(i);
            char low = Character.toLowerCase(i);
            if(set.contains(up) && set.contains(low)){
                set.remove(up);
                set.remove(low);
                cnt++;
            }
        }
        return cnt;
    }
}