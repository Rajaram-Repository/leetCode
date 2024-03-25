class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int [] arr = new int[nums.length+1];
        List<Integer> list = Arrays.stream(nums)
                                    .peek(x -> arr[x]++) 
                                    .filter(x -> arr[x] != 1) 
                                    .boxed()
                                    .collect(Collectors.toList());
        return list;
    }
}