class Solution:
    def minOperations(self, nums: List[int]) -> int:
        count = Counter(nums)
        if 1 in count.values():
            return -1
        c = 0
        for i in count.values():
            c += i//3
            if i%3 :
                c+=1
        return c
            