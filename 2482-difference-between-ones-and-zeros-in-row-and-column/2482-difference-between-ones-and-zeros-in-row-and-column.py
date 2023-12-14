class Solution:
    def onesMinusZeros(self, grid: List[List[int]]) -> List[List[int]]:
        row = []
        row_l = len(grid[0])
        for i in grid:
            c = i.count(1)
            val = c - (row_l - c)
            row.append(val)
        col = []
        col_l = len(grid)
        for i in range(row_l):
            c=0
            for j in range(col_l):
                c +=grid[j][i]
            val = c - (col_l - c)
            col.append(val)
            
        for i in range(col_l):
            for j in range(row_l):
                grid[i][j]=row[i]+col[j]
        return grid
            