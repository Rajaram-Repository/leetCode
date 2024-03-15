class Solution {
    public int[] productExceptSelf(int[] nums) {
        int num[]= new int[nums.length];
        int mul =1;
        int c = 0; 
        for(int x : nums)
            if(x!=0)
                mul*=x;
            else if(c<2)
                c++;
            else
                return num;
        if(c==1){
            for(int i=0;i<nums.length;i++)
                num[i]=nums[i]==0?mul:0;
        }
        else if(c==0){
            for(int i=0;i<nums.length;i++)
                num[i]=mul/nums[i];
        }      
        return num;
    }
}