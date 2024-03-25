class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int x : nums)
            if(map.containsKey(x))
                list.add(x);
            else
                map.put(x,1);
        return list;
    }
}