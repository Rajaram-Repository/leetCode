class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val =nums.length/3;
        List<Integer> list = new ArrayList<>();
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        for(Integer x : map.keySet()){
            if(map.get(x)>val)
                list.add(x);
        }
        return list;
    }
}