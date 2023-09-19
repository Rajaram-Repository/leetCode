class Solution {
    public int findDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.add(nums[i]))
                continue ;
            else
                return nums[i];
        } 
        return -1;
    }
}