from collections import Counter
class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        l =len(nums)
        val =sum(set(nums))
        return [sum(nums)-val, l*(l+1)//2-val]