class Solution {
    int [] ans ;
    public int[] searchRange(int[] nums, int target) {
        ans = new int [2];
        ans[0]=ans[1]=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                ans[0]=ans[1]=mid;
                for(int i=mid;i>=0;i--)
                    if(nums[i]==target)
                        ans[0]=i;
                    else
                        break;
                for(int i=mid;i<nums.length;i++)
                    if(nums[i]==target)
                        ans[1]=i;
                    else
                        break;
                return ans;
            }
            else if(nums[mid]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return ans;
    }
}