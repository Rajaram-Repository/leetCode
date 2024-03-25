class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int max = 0;
        for(int x :nums)
            max=Math.max(max,x);
        int [] arr = new int[max+1];
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            arr[x]++;
            if(arr[x]!=1)
                list.add(x);
        }
        return list;
    }
}