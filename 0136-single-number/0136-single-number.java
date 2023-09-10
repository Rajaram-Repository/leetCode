class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int op = 0;
        List <Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))
                op -=nums[i];
            else{
                list.add(nums[i]);  
                op +=nums[i];
            }
        }
        return op;
    }
}