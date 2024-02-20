class Solution {
    public int missingNumber(int[] nums) {
        int t =0;
        int c =0;
        for(int i =0;i<nums.length;i++){
            c+=i;
            t+=nums[i];
        }
        c+=nums.length;
        return c-t;
    }
}