class Solution:
    def minFallingPathSum(self, matrix: List[List[int]]) -> int:
        l = len(matrix)
        for i in range(1,l):
            for j in range(l):
                mid = matrix[i-1][j]
                left = matrix[i-1][j-1] if j>0 else float('inf')
                right = matrix[i-1][j+1] if j<l-1 else float('inf')
                matrix [i][j]=matrix [i][j]+min(mid,left,right)
        return min(matrix[-1])
        
                