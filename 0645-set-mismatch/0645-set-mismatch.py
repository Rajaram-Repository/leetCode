from collections import Counter
class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        l =len(nums)
        arr = [True] * (l+1)
        t = 0
        val = 0
        for i in nums:
            if arr[i]:
                val+=i
                t+=i
            else:
                t+=i
            arr[i]=False
        return [t-val, l*(l+1)//2-val]