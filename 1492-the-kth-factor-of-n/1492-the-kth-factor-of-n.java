class Solution {
    public int kthFactor(int n, int k) {
        if(n<k)
            return -1;
        int j = 0;
        for(int i=1;i<=n;i++){
            System.out.println(i+"  "+j);
            if(n%i==0)
                j++;
            if(j==k)
                return i;
        }
        return -1;
    }
}