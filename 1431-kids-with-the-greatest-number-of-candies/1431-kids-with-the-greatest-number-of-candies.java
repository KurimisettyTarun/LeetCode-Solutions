class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = candies[0];
        for (int c : candies) {
            if (c > max) max = c;
        }

        for(int i: candies)
        {
            if(i+extraCandies>=max)
            {
                res.add(true);
            }
            else
            res.add(false);
        }
        return res;
    }
}