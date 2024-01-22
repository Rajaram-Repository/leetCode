from collections import Counter
class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        counter = Counter(nums)
        for key, value in counter.items():
            if value==2:
                f=key
                break

        for i in range(1,len(nums)+1):
            if i not in counter:
                return [f,i]
        