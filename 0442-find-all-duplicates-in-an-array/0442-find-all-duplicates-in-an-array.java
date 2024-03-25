class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums) 
            if (!set.add(num)) 
                result.add(num);
        
        return result;
    }
}