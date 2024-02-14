class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
          return "";
        int l = str1.length();
        int r = str2.length();
        while(r!=0){
            int temp = r;
            r = l%r;
            l = temp;
        }
        return str1.substring(0,l);
    }
}