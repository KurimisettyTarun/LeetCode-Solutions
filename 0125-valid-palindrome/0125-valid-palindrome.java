class Solution {
    public boolean isPalindrome(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String st : arr)
        {
            sb.append(st);
        }
        s=sb.toString().toLowerCase();
        s= s.replaceAll("[^a-zA-Z0-9]", "");
        int st=0,end=s.length()-1;

        while(st<end)
        {
            if(s.charAt(st)!=s.charAt(end))
            {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}