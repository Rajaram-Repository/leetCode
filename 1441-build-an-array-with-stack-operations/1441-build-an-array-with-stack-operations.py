class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        l = []
        k = 0
        for i in range(1,n+1):
            if k<len(target) and target[k]==i:
                l.append("Push")
                k+=1
            else:
                l.append("Push")
                l.append("Pop")
            if "Pop" not in l and len(target)==len(l):
                return l
        for i in range(len(l)-1,-1,-2):
            if l[i]=='Pop' and l[i-1] =='Push':
                l.pop(i)
                l.pop(i-1)
            else:
                return l
        return l