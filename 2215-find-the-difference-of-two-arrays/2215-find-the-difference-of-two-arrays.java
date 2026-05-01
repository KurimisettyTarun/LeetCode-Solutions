class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i: nums1)
        s1.add(i);

        for(int i: nums2)
        s2.add(i);

        return Arrays.asList(diff(s1, s2), diff(s2, s1));

    }

    public List<Integer> diff (Set<Integer> n, Set<Integer> s)
    {
        List<Integer> re= new ArrayList<>();
        for(int i : n)
        {
            if((!s.contains(i)))re.add(i);
        }
        return re;
    }
}