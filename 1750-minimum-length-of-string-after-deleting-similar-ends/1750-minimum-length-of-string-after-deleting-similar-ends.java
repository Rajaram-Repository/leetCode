class Solution {
    public int minimumLength(String s) {
        int l = 0 ;
        int r = s.length()-1 ;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                int n =r-l+1;
                return n<0?0:n;
            }  
            char val = s.charAt(l);
            while(l<=r && val==s.charAt(l))
                l++;
            while(r>=l && val==s.charAt(r))
                r--;
        }
        int n =r-l+1;
        return n<0?0:n;
    }
}