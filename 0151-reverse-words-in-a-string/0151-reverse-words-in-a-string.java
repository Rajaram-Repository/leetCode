class Solution {
    public String reverseWords(String s) {
        String arr [] = s.split(" ");
        String ans ="";
        for(String x : arr)
            if(!x.equals(""))
                ans=x+" "+ans;
            
        return ans.substring(0,ans.length()-1);
    }
}