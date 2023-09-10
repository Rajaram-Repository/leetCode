class Solution {
    public int singleNumber(int[] nums) {
        int op = 0;
        for(int i=0;i<nums.length;i++)
            op ^=nums[i];
        return op;
    }
}