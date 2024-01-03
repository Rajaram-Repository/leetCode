class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        c =0
        l = []
        for i in bank:
            a = i.count("1")
            if a>0:
                l.append(int(a))
        for i in range(1,len(l)):
            c += (l[i-1] *l[i])
        return c