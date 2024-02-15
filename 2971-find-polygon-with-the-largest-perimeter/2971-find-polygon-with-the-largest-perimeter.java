class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        int c = nums.length;
        for(int i=0;i<c;i++)
            sum+=nums[i];
        for(int i=c-1;i>=0;i--)
            if(sum-nums[i]>nums[i])
                return sum;
            else
                sum-=nums[i];
        
        return -1;
    }
}