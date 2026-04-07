class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> res = new HashSet<>();

        for(int j : nums)
        {
            res.add(j);
            // int temp = Integer.parseInt(new StringBuilder(String.valueOf(j)).reverse().toString());
            // res.add(temp);
            int rev=0;
            while(j!=0)
            {
                int rem = j%10;
                rev=(rev*10)+rem;
                j/=10;
            }
            res.add(rev);
        }
        return res.size();
    }
}