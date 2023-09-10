class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],(map.get(nums[i])+1));
            else
                map.put(nums[i],1);        
        }
        System.out.println(map);
        for(Integer x : map.keySet()){
            System.out.println(x+"~~"+map.get(x));
            int a =map.get(x);
            if(a==1){
                return x;
            }
        }
        return nums[nums.length-1];
    }
}