class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int [] arr = new int[100000];
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            arr[x]++;
            if(arr[x]!=1)
                list.add(x);
        }
        return list;
    }
}