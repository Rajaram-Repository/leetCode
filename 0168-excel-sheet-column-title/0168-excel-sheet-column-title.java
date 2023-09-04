class Solution {
    public String convertToTitle(int columnNumber) {
        String op ="";
        while(columnNumber>0){
            columnNumber--;
            op=(char)('A'+columnNumber%26)+op;
            columnNumber/=26;
        }
        return op;
    }
}