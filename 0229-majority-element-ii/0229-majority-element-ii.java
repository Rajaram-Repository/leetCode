class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val =nums.length/3;
        List<Integer> list = new ArrayList<>();
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
            if(map.get(nums[i])>val && !list.contains(nums[i]))
                list.add(nums[i]);
        }
        return list;
    }
}