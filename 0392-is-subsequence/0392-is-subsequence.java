class Solution {
    public boolean isSubsequence(String s, String t) {
        int p = -1;
        int j=0;
        for(int i=0;j<s.length() && i<t.length();i++)
                if(t.charAt(i)==s.charAt(j))
                    j++;
        if(j==s.length())
            return true;
        return false;
    }
}