class Solution {
    public int minimumLength(String s) {
        while(s.length()>1 && (s.charAt(0)== s.charAt(s.length()-1) )){
            char val = s.charAt(0);
            int i ;
            for(i=0;i<s.length();i++)
                if(val!=s.charAt(i))
                    break;
            if(i==s.length())
                return 0;
            int j;
            for(j=s.length()-1;j>=0;j--)
                if(val!=s.charAt(j))
                    break; 
            s = s.substring(i,j+1);   
        }
        return s.length();
    }
}