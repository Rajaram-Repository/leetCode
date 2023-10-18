class Solution {
    public int titleToNumber(String columnTitle) {
        long ans = 0;
        int a =1;
        for(int i=columnTitle.length()-1;i>=0;i--){
            ans +=(columnTitle.charAt(i)-64) * a;
            a *=26;
        }
        return (int)ans;
    }
}