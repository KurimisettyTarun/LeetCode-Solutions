class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> s = new HashSet<>();
        for(char c : word.toCharArray())
            s.add(c);

        int cnt=0;

        for(char c : word.toCharArray())
        {
            char up = Character.toUpperCase(c);
            char low = Character.toLowerCase(c);


            if(s.contains(up) && s.contains(low) && word.lastIndexOf(low)<word.indexOf(up)){
                s.remove(up);
                s.remove(low);
            cnt++;
            }
            else
            {
                s.remove(c);
            }
        }
        return cnt;
    }
}