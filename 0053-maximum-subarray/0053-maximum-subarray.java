class Solution {
    public int maxSubArray(int[] nums) {
        int c =Integer.MIN_VALUE;
        int m =0;
        for(int i=0;i<nums.length;i++){
                m+=nums[i];
                c=Math.max(c,m);
                if(m<0)
                    m=0;
        }
        return c;
    }
}