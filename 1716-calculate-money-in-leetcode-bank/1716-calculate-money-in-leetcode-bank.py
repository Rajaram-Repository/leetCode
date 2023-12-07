class Solution:
    def totalMoney(self, n: int) -> int:
        r = n//7
        s = n%7
        
        ans = ((r * (r-1))//2 ) * 7
        ans += r * 28
        ans += ((s * (s+1))//2)+(s*r)
        
        return ans