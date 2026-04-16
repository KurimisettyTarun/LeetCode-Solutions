class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int []res = new int [arr.length];
        int rank=1;
        int []copy = arr.clone();
        Arrays.sort(copy);
        Map<Integer,Integer> ranks = new HashMap<>();
        for(int i : copy)
        {
          if(!ranks.containsKey(i))
          {
            ranks.put(i,rank++);
          }
        }
        for(int i = 0; i<res.length; i++)
        {
            res[i]= ranks.get(arr[i]);
        }
        return res;
    }
}