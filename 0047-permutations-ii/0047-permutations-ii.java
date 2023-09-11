class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean [] vis = new boolean [nums.length];  
        search(new ArrayList<>(),vis,nums);
        return list;
    }
    public void search(List l,boolean [] index ,int [] nums){
        if(l.size()==nums.length && !list.contains(l)){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(index[i])
                continue;
            index[i]=true;
            l.add(nums[i]);
            search(l,index,nums);
            l.remove(l.size()-1);
            index[i]=false;
        }
    }
}