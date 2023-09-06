class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length==0) return 1;
        int c[] = new int[n+1];
        for(int i=0;i<trust.length;i++){
           c[trust[i][0]]--;
           c[trust[i][1]]++; 
        }
        for(int i=0;i<c.length;i++)
            if(c[i]==n-1)
                return i;
        return -1;
    }
}