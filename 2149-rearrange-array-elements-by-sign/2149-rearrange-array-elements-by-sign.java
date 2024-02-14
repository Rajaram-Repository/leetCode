class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] n = new int[nums.length];
        int k =0;
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                n[j]=nums[i];
                j+=2;
            }
            else{
                n[k]=nums[i];
                k+=2;
            }
        }
        return n;
    }
}