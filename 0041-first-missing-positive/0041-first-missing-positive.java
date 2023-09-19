class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean [] arr = new boolean [nums.length+1];
        int c =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < arr.length && nums[i]>0)
                arr[nums[i]]=true;
        }
        for(int i=1;i<arr.length;i++)
            if(!arr[i])
                return i;
        return arr.length;
    }
}