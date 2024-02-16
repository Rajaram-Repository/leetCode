class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map <Integer,Integer> map = new HashMap<>();
        for(int i : arr)
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        
        Map<Integer,List<Integer>> m = new HashMap<>();
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            List<Integer> l = new ArrayList<>();
            if(m.containsKey(i.getValue()))
                l = m.get(i.getValue());
            l.add(i.getKey());
            m.put(i.getValue(),l);
        }
        Set <Integer> set = new TreeSet<>(m.keySet());
        int c =0;
        int j =0;
        for(Integer i : set){
            j =j+ (m.get(i).size()*i);
            if(j> k){
                int dif =j - k;
                c= dif/i;
                if(dif%i!=0)
                    c++;
                m.remove(i);
                break;
            }
            m.remove(i);
        }
        for(List<Integer> o : m.values())
            c+=o.size();
        return c;
    }
}