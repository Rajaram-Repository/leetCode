from collections import Counter
class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        seen = set()
        for num in nums:
            if num in seen:
                f=num
                break
            else:
                seen.add(num)
        
        seen.update(nums)
        for i in range(1,len(nums)+1):
            if i not in nums:
                return [f,i]
        