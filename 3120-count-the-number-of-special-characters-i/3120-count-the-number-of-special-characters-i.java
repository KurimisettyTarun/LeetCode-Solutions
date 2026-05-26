class Solution {
    public int numberOfSpecialChars(String word) {

        Set<Character> set = new HashSet<>();
        for(char c : word.toCharArray())
        set.add(c);

        int cnt = 0;
        for(char i : word.toCharArray())
        {
            if(set.contains(Character.toUpperCase(i)) && set.contains(Character.toLowerCase(i))){
                set.remove(Character.toUpperCase(i));
                set.remove(Character.toLowerCase(i));
                cnt++;
            }
        }
        return cnt;
    }
}