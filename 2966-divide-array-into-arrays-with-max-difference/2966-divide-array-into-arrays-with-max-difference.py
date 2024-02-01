class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        nums.sort()
        ans = []
        j = 0
        for i in range(3,len(nums)+1,3):
            l=[]
            while j<i:
                l.append(nums[j])
                j+=1
            if l[-1] - l[0] > k :
                return []
            ans.append(l)
            j=i
        return ans

    def has_duplicates(self,lst):
        seen = set()
        for element in lst:
            if element in seen:
                return True
            seen.add(element)
        return False


