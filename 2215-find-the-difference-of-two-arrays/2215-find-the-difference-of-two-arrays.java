class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i: nums1)
        s1.add(i);

        for(int i: nums2)
        s2.add(i);

        res.add(check(s1,s2));
        res.add(check(s2,s1));

        return res;
    }

    public List<Integer> check (Set<Integer> n, Set<Integer> s)
    {
        List<Integer> re= new ArrayList<>();
        for(int i : n)
        {
            if((!s.contains(i)))re.add(i);
        }
        return re;
    }
}