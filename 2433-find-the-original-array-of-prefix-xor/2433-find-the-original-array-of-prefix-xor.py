class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        n = len(pref)
        result=[]
        result.append(pref[0])

        for i in range(1, n):
            result.append( pref[i] ^ pref[i - 1])

        return result
            