class Solution {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
     Set<Integer> s = new HashSet<>();
     List<Integer> res = new ArrayList<>();
     for(int i : nums)
     s.add(i);

     for(int i=1 ;i<=nums.length;i++)
     {
        if(!s.contains(i))res.add(i);
     }
     return res;
    }
}