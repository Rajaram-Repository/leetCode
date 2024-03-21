class Solution {
    public List<List<String>> solveNQueens(int n) {
        String s = ".........".substring(0,n);
        List<List<String>> ans = new ArrayList<>();
        List<String> pos = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = s.substring(0,i)+"Q"+s.substring(i+1);
            pos.add(str);
        }
        find(pos,ans, new ArrayList<>(),0);
        return ans;
    }
    public void find(List<String> list ,List<List<String>> ans,List<String> l,int s ){
        if(l.size()==list.size() && check(l) ){
            ans.add(new ArrayList<>(l));
        }
        else{
            for(int i=0;i<list.size();i++){
                if(l.contains(list.get(i))) continue;
                l.add(list.get(i));
                find(list,ans,l,i+1);
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