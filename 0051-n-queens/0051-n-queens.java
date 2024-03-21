class Solution {
    List<String> list = new ArrayList<>();
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        String s = ".........".substring(0,n);
        for(int i=0;i<n;i++){
            String str = s.substring(0,i)+"Q"+s.substring(i+1);
            list.add(str);
        }
        find(new ArrayList<>());
        return ans;
    }
    public void find(List<String> l){
        if(l.size()==list.size() && check(l) ){
            ans.add(new ArrayList<>(l));
        }
        else{
            for(int i=0;i<list.size();i++){
                if(l.contains(list.get(i))) continue;
                l.add(list.get(i));
                find(l);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean check(List<String> list ){
         for(int i=0;i<list.size();i++){
            int j = list.get(i).indexOf("Q")-1;
            int k = i-1;
            while(k>=0 && j>=0 && k<list.size() && j<list.get(i).length()){
                if(list.get(k).charAt(j)=='Q')
                    return false;
                k--;j--;

            }
            k=i-1;j = list.get(i).indexOf("Q")+1;
            while(k>=0 && j>=0 && k<list.size() && j<list.get(i).length()){
                if(list.get(k).charAt(j)=='Q')
                    return false;
                k--;j++;

            }
            k=i+1;j = list.get(i).indexOf("Q")-1;
            while(k>=0 && j>=0 && k<list.size() && j<list.get(i).length()){
                if(list.get(k).charAt(j)=='Q')
                    return false;
                k++;j--;
            }
            k=i+1;j = list.get(i).indexOf("Q")+1;
            while(k>=0 && j>=0 && k<list.size() && j<list.get(i).length()){
                if(list.get(k).charAt(j)=='Q')
                    return false;
                k++;j++;
            }
         }
        return true;
    }
}