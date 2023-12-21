class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        l = len(points)
        ans = []
        for i in range(l):
            ans.append(points[i][0])
        ans.sort()
        l = len(ans)
        c  = -1
        for i in range(1,l):
            val= ans[i]-ans[i-1]
            if val>c:
                c=val
        return c