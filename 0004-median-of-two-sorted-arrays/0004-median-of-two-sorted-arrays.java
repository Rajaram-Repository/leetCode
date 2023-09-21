class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length+nums2.length;
        int mid = total/2;
        int arr [] = new int [mid+1];
        int i = 0 , n1 = 0 , n2 = 0;
        
        for(i=0; i<=mid && n1<nums1.length && n2<nums2.length; i++)
            if(nums1[n1]<nums2[n2])
                arr[i]=nums1[n1++] ;
            else 
                arr[i]=nums2[n2++] ;
        
        if(n1<nums1.length)
            mtd (arr,i,nums1,n1);
        else
            mtd (arr,i,nums2,n2);
        
        if(total%2==0)
            return ((double)arr[mid-1] +(double)arr[mid]) /2;
        return (double)arr[mid];
            
    }
    public void mtd(int []num,int pos,int [] nums,int n){
        for(int i=pos;i<num.length;i++) num[i]=nums[n++];
    }
}