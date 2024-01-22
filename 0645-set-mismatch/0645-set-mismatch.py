class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        nums.sort()
        arr = [0,0]
        c = 0
        l = len(nums)
        t = l *(l+1) 
        t //=2
        for i in range(1,l):
            c += nums[i-1]
            if nums[i]==nums[i-1]:
                arr[0]=nums[i]
        c += nums[l-1]
        c -= arr[0]
        arr[1]=t-c
        return arr
    
        