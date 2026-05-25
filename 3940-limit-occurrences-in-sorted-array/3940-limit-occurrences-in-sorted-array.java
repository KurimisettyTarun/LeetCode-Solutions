class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> li = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet())
        {
            if(map.get(i)<k)
            {
                for(int j=0; j<map.get(i);j++)
                li.add(i);
            }
            else
            {
                if(map.get(i)>=k)
                {
                    for(int j=0; j<k;j++)
                    li.add(i);
                }
            }
        }

        int [] res = new int[li.size()];
        int j=0;
        for(int i : li)
        {
            res[j++]= i;
        }
        Arrays.sort(res);
        return res;
    }
}