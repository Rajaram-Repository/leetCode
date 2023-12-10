class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        r = len(matrix)
        c = len(matrix[0])
        l = []
        for i in range(c):
            row = []
            for j in range(r):
                row.append(matrix[j][i])
            l.append(row)
        return l
                