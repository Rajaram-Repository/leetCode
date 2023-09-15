class Solution {
    public String sortSentence(String s) {
        String ans[] = s.split(" ");
        String op[] = new String [ans.length]; 
        for(int i=0;i<ans.length;i++)
            op[Integer.parseInt(ans[i].charAt(ans[i].length()-1)+"")-1]=ans[i].substring(0,ans[i].length()-1);
        return String.join(" ",op);
    }
}