class Solution {
    public int mostFrequentEven(int[] nums) {
        int res=-1;
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
        {
            if(n%2==0)
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
        for(int key : map.keySet())
        {
            int freq = map.get(key);
            if (freq > max || (freq == max && key < res)) {
                max = freq;
                res = key;
            }    
        }
        return res;
    }
}