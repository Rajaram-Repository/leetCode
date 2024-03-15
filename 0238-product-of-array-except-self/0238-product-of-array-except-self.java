class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul =1;
        int c = 0; 
        for(int x : nums)
            if(x!=0)
                mul*=x;
            else
                c++;
        int num[]= new int[nums.length];
        if(c>=2)
            return num;
        for(int i=0;i<nums.length;i++)
            if(c==1)
                num[i]=nums[i]==0?mul:0;
            else
                num[i]=mul/nums[i];
        return num;
    }
}