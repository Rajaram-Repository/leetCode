class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List <Integer> list = new ArrayList<>();
        if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        Arrays.sort(nums);
        int arr[]= new int[nums.length+1];
        Arrays.fill(arr,1);
        int max = 1;
        for(int i =1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && 1+arr[j]>arr[i]){
                    arr[i]=arr[j]+1;
                    max=Math.max(max,arr[i]);
                }
            }
        }

        
        int prev =-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]==max && (prev==-1||prev%nums[i]==0)){
                list.add(nums[i]);
                max-=1;
                prev = nums[i];
            }
        }
        return list;
    }
}