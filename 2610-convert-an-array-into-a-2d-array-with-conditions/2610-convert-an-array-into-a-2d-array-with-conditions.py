class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        count = Counter(nums)
        l = max(count.values())
        arr = list(count.elements())
        return [ arr[i::l] for i in range(l)]