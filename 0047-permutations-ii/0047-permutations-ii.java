class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        search(new ArrayList<>(),new ArrayList<>(),nums);
        return list;
    }
    public void search(List l,List index ,int [] nums){
        if(l.size()==nums.length && !list.contains(l)){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(index.contains(i))
                continue;
            index.add(i);
            l.add(nums[i]);
            search(l,index,nums);
            l.remove(l.size()-1);
            index.remove(index.size()-1);
        }
    }
}