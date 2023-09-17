import java.math.BigDecimal;
class Solution {
    public double myPow(double x, int n) {
        if(n<0)
            x=1/x;
        n = Math.abs(n);
        double pow = 1 ;
        while(n!=0){
            if(n%2!=0)
                pow*=x;
            x*=x;
            n/=2;
        }
        return pow;
    }
}