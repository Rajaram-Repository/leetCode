class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val =nums.length/3;
        List<Integer> list = new ArrayList<>();
        Map <Integer,Integer> map = new HashMap<>();
        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);
        for( Map.Entry<Integer, Integer> x : map.entrySet() )
            if(x.getValue()>val)
                list.add(x.getKey());
        return list;
    }
}