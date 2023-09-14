class Solution {
    public int minDeletionSize(String[] strs) {
        int c = 0 ;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if( strs[j-1].charAt(i)>strs[j].charAt(i) ){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}