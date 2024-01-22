class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        i = 0
        l = len(nums)
        while i < l :
            correct = nums[i] - 1
            if nums[i] != nums[correct]:
                nums[correct], nums[i] = nums[i], nums[correct]
            else:
                i += 1

        for i in range(l):
            if nums[i] != i + 1:
                return [nums[i], i + 1]
    
        