class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> li = new ArrayList<>();
        for (int num : nums){
            if(num!=val)
            li.add(num);
        }

        for(int i=0;i<li.size();i++)
        {
            nums[i]=li.get(i);
        }
        return li.size();
    }
}