class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List <Integer> list = new ArrayList<>();
        String num =  "123456789";
        String a = String.valueOf(low);
        String b = String.valueOf(high);
        int s = 0;
        int e = a.length();
        int val = e;
        
        while(val<=b.length()){
            s=0;
            e=val;
            while(e<=9){
                String n = num.substring(s++,e++);
                int in = Integer.parseInt(n);
                if (in<low){
                    continue ;
                }
                if (in>high) {
                    return list;
                }
                list.add(in);
            }
            val++;
        }
        return list;
        
    }
}