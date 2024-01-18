class Solution:
    def climbStairs(self, n: int) -> int:
        if n<=3:
            return n
        prev = 1
        curr = 2
        for i in range(3,n+1):
            temp = curr 
            curr = prev+curr
            prev = temp
        return curr