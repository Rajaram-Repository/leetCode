class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char f = s.charAt(i);
            s = s.substring(0,i)+"0"+s.substring(i+1);
            if(!s.contains(f+""))
                return i;
            s = s.substring(0,i)+f+s.substring(i+1);
        }
        return -1;
    }
}