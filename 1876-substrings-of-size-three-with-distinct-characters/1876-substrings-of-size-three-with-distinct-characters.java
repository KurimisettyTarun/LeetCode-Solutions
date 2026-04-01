class Solution {
    public int countGoodSubstrings(String s) {
        char[] chars = s.toCharArray();
        int len= chars.length;
        List<String> li = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len;i++)
        {
            if(sb.length()<3)
            {
                sb.append(chars[i]);
            }
            else
            {
                sb.deleteCharAt(0);
                sb.append(chars[i]);
            }
            if(sb.length()==3 && check(sb.toString())){
                li.add(sb.toString());
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