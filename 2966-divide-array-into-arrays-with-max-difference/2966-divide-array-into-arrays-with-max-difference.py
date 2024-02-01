class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        nums.sort()
        ans = []
        j = 0
        for i in range(3,len(nums)+1,3):
            l=[]
            if nums[i-1] - nums[j] > k :
                return []
            while j<i:
                l.append(nums[j])
                j+=1
            ans.append(l)
            j=i
        return ans



