class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            // map.computeIfAbsent(nums[i],k -> new ArrayList<>()).add(i);
            if(map.containsKey(nums[i]))
            map.get(nums[i]).add(i);
            else{
            map.put(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
            }
        }
        int res = Integer.MAX_VALUE;
        for(List<Integer> list : map.values())
        {
            if (list.size() < 3) continue;
            for(int i=0;i<list.size()-2;i++)
            {
                int a = list.get(i);
                int b = list.get(i + 1);
                int c = list.get(i + 2);
                int dist = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                res = Math.min(res, dist);
            }
        }
            return res == Integer.MAX_VALUE ? -1 : res;
    }
}
 