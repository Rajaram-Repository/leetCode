class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        l = []
        k = 0
        for i in range(1,n+1):
            if target[k]==i:
                l.append("Push")
                k+=1
            else:
                l.append("Push")
                l.append("Pop")
            if k>=len(target):
                return l
        return l
