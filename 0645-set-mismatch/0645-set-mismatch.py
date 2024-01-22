class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        arr = [0,0]
        c = sum(nums)
        l = len(nums)
        t = l *(l+1) 
        t //=2
        for i in nums:
            if nums.count(i)!=1:
                arr[0]=i
                c -= i
                arr[1]=t-c
                return arr
        return arr
    
        