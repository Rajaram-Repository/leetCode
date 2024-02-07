class Solution {
    public String frequencySort(String s) {
        int arr[] = new int[80];
        for(char x : s.toCharArray())
            arr[x-'0']++;
        Map <Integer,String> map = new HashMap<>();
        Set <Integer> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                continue;
            if(map.containsKey(arr[i])){
                map.put(arr[i],mtd(map.get(arr[i])+con(arr[i],i))) ;
            }
            else{
                map.put(arr[i],con(arr[i],i));
                set.add(arr[i]);
            }
        }
        String ans = "";
        for(Integer i : set){
            ans+=map.get(i);
        }
        StringBuilder z = new StringBuilder(ans);
        return new String(z.reverse());
        
    }
    public String con(int n,int i){
        String s =""; 
        char c =(char)(i+'0');
        for(int x=0;x<n;x++)
            s+=c;      
        return s;
    }
    public String mtd(String str){
        char x [] = str.toCharArray();
        Arrays.sort(x);
        return new String(x);
    }
}