class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        char a =s.charAt(0);
        for(int i=s.charAt(0)-'0';i<=s.charAt(3)-'0';i++,a++ )
            for(int j=s.charAt(1)-'0';j<=s.charAt(4)-'0';j++ )
                list.add(a+""+j);
        return list;
    }
}