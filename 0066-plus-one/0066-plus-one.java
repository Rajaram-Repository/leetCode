class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<=8){
            digits[digits.length-1]++;
            return digits;
        }
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--){
            int val = digits[i]+carry;
            digits[i]=val%10;
            carry=val/10;
            if(carry==0)
                return digits;
        }
        int nums[] = new int[digits.length+1];
        nums[0]=carry;
        int z = 1;
        for(int x : digits)
            nums[z++] = x;
        return nums;
    }
}