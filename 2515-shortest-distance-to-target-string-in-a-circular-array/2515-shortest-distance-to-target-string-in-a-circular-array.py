class Solution:
    def closetTarget(self, words: List[str], target: str, startIndex: int) -> int:
        c = -1
        i = startIndex+1
        ii = 1
        j = startIndex-1
        jj = 1
        l = len(words)
        if target == words[startIndex]:
            return 0
        while (startIndex!=i):
            if i < l:
                if words[i]==target:
                    return ii
                ii+=1
                i+=1
            else :
                i=0
                if words[i]==target:
                    return ii
            if j >=0:
                if words[j]==target:
                    return jj
                jj+=1
                j-=1
            else:
                j =l-1
                if words[j]==target:
                    return jj
        return c
            