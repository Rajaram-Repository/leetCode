class Solution:
    def hammingWeight(self, n: int) -> int:
        c = 0
        while n!=0 :
            c += n&1
            n >>=1
        return c