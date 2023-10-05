class Solution {
    public int[] twoSum(int[] nums, int target) {
        int op[]= new int [2];
     for(int i=0;i<nums.length;i++)
         for(int j=i+1;j<nums.length;j++){
             int a = nums[i]+nums[j];
             if(target-a ==0){
                 op[0]=i;
                 op[1]=j;
                 return op;
             }
         }
      return op;
    }
}