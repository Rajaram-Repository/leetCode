class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int c = nums[0] ;
        for(int i=1;i<nums.length;i++){
            if(c==nums[i])
                return c;
            c=nums[i];
        } 
        return c;
    }
}