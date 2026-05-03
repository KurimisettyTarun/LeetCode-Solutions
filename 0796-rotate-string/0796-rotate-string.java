class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal))return true;
        for(int i = s.length()-1; i>=0;i--)
        {
            String x = s.substring(i,s.length());
            if(goal.contains(x))
            {
                continue;
            }
            x= x.substring(1,x.length());
            x+=s.substring(0,i+1);
            if(x.equals(goal))return true;
        }
        return false;
    }
}