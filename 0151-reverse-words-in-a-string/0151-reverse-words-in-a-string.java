class Solution {
    public String reverseWords(String s) {
        String arr [] = s.split(" ");
        String ans ="";
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].equals("")){
                ans=ans+arr[i]+" ";
            }
        }
        return ans.substring(0,ans.length()-1);
    }
}