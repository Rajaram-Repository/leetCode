class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        sort = sorted(nums,reverse=True)
        return (sort[0]-1) * (sort[1]-1)