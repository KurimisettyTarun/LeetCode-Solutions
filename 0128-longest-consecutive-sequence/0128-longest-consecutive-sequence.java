class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
       Set<Integer> set = new HashSet<>();
       int cnt=1;
       int max=1;
       for(int i:nums)
        set.add(i);
        for(int i : set)
        {
            if(set.contains(i-1))
            continue;
            while(set.contains(i+1))
            {
                cnt++;
                i++;
            }
            if(cnt>max) max=cnt;
            cnt=1;
        }
        return max;
    }
}