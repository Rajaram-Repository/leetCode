class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int c =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<1 || c==nums[i])
                continue ;
            c++;
            if(c!=nums[i])
                return c;
        }
        return c+1;
    }
}