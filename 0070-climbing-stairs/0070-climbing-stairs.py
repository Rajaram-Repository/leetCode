class Solution:
    def climbStairs(self, n: int) -> int:
        if n<=3:
            return n
        prev = 1
        curr = 1
        for i in range(2,n+1):
            temp = curr 
            curr = prev+curr
            prev = temp
        return curr