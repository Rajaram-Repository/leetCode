class Solution {
    
    List<List<String>> list = new ArrayList<>();
    
    public List<List<String>> partition(String s) {
        res(new ArrayList<>(),s);
        return list;
    }
    public void res (List<String> l,String s){
        if(s==null || s.length()==0){
            list.add(new ArrayList<>(l));
            return ;
        }
        for(int i=0;i<s.length();i++){
            String a = s.substring(0,i+1);
            if(!pal(a))
                continue ;
            l.add(a);
            res(l,s.substring(i+1,s.length()));
            l.remove(l.size()-1);
        }
    }
    public boolean pal(String s){
        int l=0 , r=s.length()-1;
        while(l<=r)
            if(s.charAt(l++)!=s.charAt(r--))
                return false;
        return true;
    }
}