class Solution {
    public List<String> cellsInRange(String s) {
        ArrayList<String> ans = new ArrayList<>();
        char c1 = s.charAt(0);
        char r1 = s.charAt(1);
        char c2 = s.charAt(3);
        char r2 = s.charAt(4);
        for(char i = c1; i<=c2; i++)
            for(char j = r1; j<= r2; j++)
                ans.add(i+""+j);
        return ans;
    }
}