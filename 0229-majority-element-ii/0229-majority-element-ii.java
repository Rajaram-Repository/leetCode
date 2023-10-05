class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val =nums.length/3;
        List<Integer> list = new ArrayList<>();
        Set <Integer> set = new HashSet<>();
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c = 1;
            if(map.containsKey(nums[i]))
                c +=map.get(nums[i]);
            map.put(nums[i],c);
            if(c>val)
                set.add(nums[i]);
        }
        list.addAll(set);
        return list;
    }
}