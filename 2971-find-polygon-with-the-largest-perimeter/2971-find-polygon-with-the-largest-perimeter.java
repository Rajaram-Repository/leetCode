class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        int val;
        int c = nums.length;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        for(int i=nums.length-1;i>=0;i--){
            System.out.println(sum+"    "+nums[i]);
            if(sum-nums[i]>nums[i]){
                return sum;
            }
            else{
                sum-=nums[i];
            }
        }
        return -1;
    }
}