class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        sort = sorted(nums,reverse=True)
        arr = sort[:2]
        return (arr[0]-1) * (arr[1]-1)