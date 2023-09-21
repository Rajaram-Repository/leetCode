class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length+nums2.length;
        boolean even = false;
        if(sum%2==0)
            even = true;
        sum /=2;
        int n1 =0,n2=0;
        int arr [] = new int[sum+1];
        int i=0;
        for(i=0;i<=sum&&n1<nums1.length && n2<nums2.length;i++)
            if(nums1[n1]<nums2[n2])
                arr[i]=nums1[n1++] ;
            else 
                arr[i]=nums2[n2++] ;
        if(n1<nums1.length)
            mtd (arr,i,nums1,n1);
        else
            mtd (arr,i,nums2,n2);
        if(even)
            return ((double)arr[sum-1] +(double)arr[sum]) /2;
        return (double)arr[sum];
            
    }
    public void mtd(int []num,int pos,int [] nums,int n){
        for(int i=pos;i<num.length;i++)
            num[i]=nums[n++];
    }
}