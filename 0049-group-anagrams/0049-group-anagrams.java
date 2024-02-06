class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String> > map = new HashMap<>();
        for(String x : strs){
            char sort [] = x.toCharArray();
            Arrays.sort(sort);
            String s = new String(sort);
            if(!map.containsKey(s))
                map.put(s,new ArrayList<>());
            map.get(s).add(x);
        }
        return new ArrayList<>(map.values());
    }
}