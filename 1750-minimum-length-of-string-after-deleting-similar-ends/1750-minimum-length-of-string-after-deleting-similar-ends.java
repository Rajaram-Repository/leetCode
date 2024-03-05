class Solution {
    public int minimumLength(String s) {
        int l = 0 ;
        int r = s.length()-1 ;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                int n =r-l+1;
                if(n<0)
                    return 0;
                return n;
            }
                
            char val = s.charAt(l);
            while(l<=r && val==s.charAt(l))
                l++;
            while(r>=l && val==s.charAt(r))
                r--;
        }
        int n =r-l+1;
        if(n<0)
            return 0;
        return n;
    }
}