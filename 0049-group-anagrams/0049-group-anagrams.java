class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> l = new ArrayList<>();
            if(!strs[i].equals("0")){
                l.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if( strs[i].length()==strs[j].length() && compare(strs[i],strs[j])){
                    l.add(strs[j]);
                    strs[j]="0";
                }
            }
            }
            if(l.size()!=0)
                list.add(l);
        }
        return list;
    }
    public Boolean compare(String str ,String ans){
        for(int i=0;i<str.length();i++){
            int index = str.indexOf(ans.charAt(i));
            if(index==-1)
                return false;
            str = str.substring(0,index)+"0"+str.substring(index+1);
        }
        return true;
    }
}