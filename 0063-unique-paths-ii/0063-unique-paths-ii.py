class Solution:
    def uniquePathsWithObstacles(self, arr: List[List[int]]) -> int:
        m = len(arr)
        n = len(arr[0])
        dp = [0] * (n+1)
        dp[n -1] = 1
        for i in range(m - 1, -1, -1):
            for j in range(n - 1, -1, -1):
                if arr[i][j] == 1:
                    dp[j] = 0
                else:
                    dp[j] = dp[j] + dp[j + 1]
        return dp[0]
        