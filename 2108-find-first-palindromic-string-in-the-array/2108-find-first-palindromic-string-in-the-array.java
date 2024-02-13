class Solution {
    public String firstPalindrome(String[] words) {
        for(String x : words)
            if(res(x))
                return x;
        return "";
    }
    public Boolean res(String x){
        int l =0;
        int r =x.length()-1;
        while(l<r)
            if(x.charAt(l++)!=x.charAt(r--))
                return false;
        return true;
    }
}