class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        if len(nums)==2:
            if nums[0]==1:
                return [1,2]
            return [2,1]
        arr=[0,0]
        nums.sort()
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                arr[0] = nums[i]
                break
        
        for j in range(1,len(nums)+1):
            if j not in nums:
                arr[1]=j
                break
        return arr 
    
        