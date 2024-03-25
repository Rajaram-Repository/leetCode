class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set <Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for(int x : nums)
            if(set.contains(x))
                list.add(x);
            else
                set.add(x);
        return list;
    }
}