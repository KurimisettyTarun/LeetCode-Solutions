class Solution {
    public int countGoodSubstrings(String s) {
        char[] chars = s.toCharArray();
        int len= chars.length;
        List<String> li = new ArrayList<>();
        for(int i=0; i<len-2;i++)
        {
            String sb = s.substring(i,i+3);
            if(check(sb)){
                li.add(sb);
            }
        }
        return li.size();
    }

    public boolean check(String s){
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }
}