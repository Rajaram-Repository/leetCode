class Solution:
    def hammingWeight(self, n: int) -> int:
        Str = bin(n)[2:]
        return Str.count('1')