class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        l = len(points)
        ans = []
        for i in range(l):
            ans.append(points[i][0])
        ans.sort()
        max_len  = -1
        for i in range(1,l):
            max_len = max(max_len,ans[i]-ans[i-1])
        return max_len
        