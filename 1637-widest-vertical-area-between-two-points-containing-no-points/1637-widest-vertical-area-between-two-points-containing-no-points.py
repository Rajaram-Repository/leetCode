class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        l = len(points)
        sorted_array = sorted(points, key=lambda x: x[0])
        max_len  = -1
        for i in range(1,l):
            max_len = max(max_len,sorted_array[i][0]-sorted_array[i-1][0])
        return max_len