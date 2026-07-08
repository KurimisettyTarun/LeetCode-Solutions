class Solution {
    public boolean hasMatch(String s, String p) {
        // if(p.charAt(0)=='*')
        // {
        //     p=p.substring(1);
        //     return s.contains(p);
        // }
        //  if(p.charAt(p.length()-1)=='*')
        // {
        //     p=p.substring(0,p.length()-1);
        //     return s.contains(p);
        // }
        // String p1 = p.substring(0,p.indexOf("*"));
        // String p2 = p.substring(p.indexOf("*")+1);
        // System.out.println(p1);
        // System.out.println(p2);

        // String s1 = s.contains(p1)?s.substring(0,s.indexOf(p1)+p1.length()):null;
        // if(s1==null)return false;
        // System.out.println(s1);

        // String s2 = s.contains(p2)?s.substring(s.lastIndexOf(p1)):null;
        // if(s2==null)return false;
        // System.out.println(s2);
        // if(s.indexOf(p1)==s.lastIndexOf(p2))return false;
        // return s1.contains(p1)&&s2.contains(p2);
        String p1 = p.substring(0, p.indexOf('*'));
        String p2 = p.substring(p.indexOf('*') + 1);

        int first = s.indexOf(p1);

        if (first == -1)
            return false;

        int second = s.indexOf(p2, first + p1.length());

        return second != -1;
    }
}