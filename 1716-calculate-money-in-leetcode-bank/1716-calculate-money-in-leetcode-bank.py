class Solution:
    def totalMoney(self, n: int) -> int:
        r = n//7
        s = n%7
        ans = 0
        c = 28
        for i in range(0,r):
            ans += c
            c +=7
        for i in range(r+1,r+s+1):
            ans+=i
        return ans