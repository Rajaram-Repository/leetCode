class Solution {
    public int singleNumber(int[] nums) {
        int op = 0;
        for(int i : nums) op ^=i;
        return op;
    }
}