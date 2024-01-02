class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        l = []
        for i in nums:
            a =self.check(l,i)
            if a>=0:
                l[a].append(i)
            else :
                n = [i]
                l.append(n)
        return l
    def check(self,l , n):
        for i in range(0,len(l)) :
            if n not in l[i]:
                return i
        return -1