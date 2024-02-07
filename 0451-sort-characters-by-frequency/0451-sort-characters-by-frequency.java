class Solution {
    public String frequencySort(String s) {
        int arr[] = new int[80];
        for(char x : s.toCharArray())
            arr[x-'0']++;
        Map <Integer,String> map = new HashMap<>();
        List <Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                continue;
            if(map.containsKey(arr[i])){
                map.put(arr[i],mtd(map.get(arr[i])+con(arr[i],i))) ;
            }
            else{
                map.put(arr[i],con(arr[i],i));
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        String ans = "";
        for(int i=list.size()-1;i>=0;i--)
            ans+= map.get(list.get(i));
        return ans;
        
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