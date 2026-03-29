class Solution {
    public boolean canBeEqual(String s1, String s2) {
        // char[] res=s1.toCharArray();
        // int temp=0;
        // while(temp<2)
        // {
        //     char c = res[temp];
        //     res[temp] = res[temp+2];
        //     res[temp+2] = c;
        //     temp++;
        // }
        // return String.valueOf(res).equals(s2);


            return ((s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
                (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0)))
            &&
               ((s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
                (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1))); 
           }
}