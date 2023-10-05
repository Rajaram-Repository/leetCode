class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                List <Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i],list);
            }
            else{
                List <Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        for(Integer x : map.keySet()){
            List <Integer> list = map.get(x);
            for(int i=0;i<list.size();i++)
                for(int j=i+1;j<list.size();j++)
                    if(Math.abs(list.get(i)-list.get(j))<=k)
                        return true;
        }
        return false;
    }
}