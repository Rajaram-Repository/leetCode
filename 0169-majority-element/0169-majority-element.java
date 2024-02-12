class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map= new HashMap<>();
        for(int x : nums)
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);
            else
                map.put(x,1);
        int val = 0;
        int max = 0;
        for(Map.Entry<Integer,Integer> m : map.entrySet())
            if(val<m.getValue()){
                val=m.getValue();
                max=m.getKey();
            }
        
        return max;
        
    }
}