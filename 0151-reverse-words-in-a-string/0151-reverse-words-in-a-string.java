class Solution {
    public String reverseWords(String s) {
        String arr [] = s.split(" ");
        String ans ="";
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].equals("")){
                ans=ans+arr[i]+" ";
            }
        }
        int i=0;
        for(i=ans.length()-1;i>=0;i--){
            if(ans.charAt(i)!=' ')
                break;    
        }
        return ans.substring(0,i+1);
    }
}