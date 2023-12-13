class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        c  = 0 
        l = len(mat)
        for i in range(0,l):
            val = mat[i].count(1)
            if val == 1:
                index = mat[i].index(1)
                flag = 0
                for j in range(0,l):
                    if mat[j][index]==1:
                        flag +=1
                        if flag ==2:
                            break
                if flag==1 :
                    c+=1
        return c
                    