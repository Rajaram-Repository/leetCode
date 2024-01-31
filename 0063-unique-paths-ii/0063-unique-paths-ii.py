class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        arr = obstacleGrid
        m = len(arr)
        n = len(arr[0])

        dp = [0] * n
        dp[n -1] = 1

        for i in range(m - 1, -1, -1):
            for j in range(n - 1, -1, -1):
                if arr[i][j] == 1:
                    dp[j] = 0
                elif j+1<n:
                    dp[j] = dp[j] + dp[j + 1]

        return dp[0]
        