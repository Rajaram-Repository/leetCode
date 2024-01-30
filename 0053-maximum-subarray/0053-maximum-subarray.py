class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        m = float('-inf')
        curr = 0
        for i in nums :
            curr +=i
            m = max(m,curr)
            if curr<0:
                curr=0
        return m