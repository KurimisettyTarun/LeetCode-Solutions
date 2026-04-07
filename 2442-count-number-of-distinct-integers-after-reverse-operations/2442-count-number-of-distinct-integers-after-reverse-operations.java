class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int i : nums)res.add(i);

        for(int j : nums)
        {
            int temp = Integer.parseInt(new StringBuilder(String.valueOf(j)).reverse().toString());
            res.add(temp);
        }
        return res.size();
    }
}