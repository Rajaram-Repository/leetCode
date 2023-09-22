class Solution {
    public boolean isSubsequence(String s, String t) {
        int p = -1;
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=p+1;j<t.length();j++){
                if(t.charAt(j)==s.charAt(i)){
                    p=j;
                    c++;
                    break;
                }
            }
        }
        if(c==s.length())
            return true;
        return false;
    }
}