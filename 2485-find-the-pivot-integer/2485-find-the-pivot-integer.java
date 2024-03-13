class Solution {
    public int pivotInteger(int n) {
        int total = (n*(n+1))/2;
        int sum =0;
        for(int i=n;i>=1;--i){
            sum+=i;
            if(sum==total)
                return i;
            total-=i;
        }
        return -1;
    }
}