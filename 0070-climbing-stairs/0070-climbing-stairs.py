class Solution:
    def climbStairs(self, n: int) -> int:
        if n<=3:
            return n
        prev = 2
        curr = 3
        for i in range(4,n+1):
            temp = curr 
            curr = prev+curr
            prev = temp
        return curr