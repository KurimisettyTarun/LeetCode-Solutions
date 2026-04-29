class Solution {
    public int countMonobit(int n) {
        if (n==0)return 1;
        if(n<3)
        {
            return 2;
        }
        int count=2;
        for(int i =3; i<=n;i++)
        {
            String s = Integer.toBinaryString(i);
            if(s.contains("1")&&s.contains("0"))
            continue;
            count++;
        }
        return count;
    }
}