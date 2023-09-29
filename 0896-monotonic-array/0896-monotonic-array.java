class Solution {
    public boolean isMonotonic(int[] nums) {
        for(int i=1;i<nums.length;i++)
            if(nums[i-1]==nums[i])
                continue ;
            else if(nums[i-1]<nums[i])
                return asc(nums,i);
            else 
                return dec(nums,i);
        return true;
    }
    public boolean asc(int []nums,int a){
        for(int i=a;i<nums.length;i++)
            if(nums[i-1]==nums[i])
                continue ;
            else if(nums[i-1]>nums[i])
                return false;
        return true;
    } 
    public boolean dec(int []nums,int a){
        for(int i=a;i<nums.length;i++)
            if(nums[i-1]==nums[i])
                continue ;
            else if(nums[i-1]<nums[i])
                return false;
        return true;
    }
}