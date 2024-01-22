class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        nums.sort()
        c = sum(nums)
        l = len(nums)
        t = l *(l+1) 
        t //=2
        for i in range(1,l):
            if nums[i]==nums[i-1]:
                c -= nums[i]
                return [nums[i],t-c]
    
        