class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        arr.sort()
        se =set()
        prev = arr[0]
        c = 1
        for i in range(1,len(arr)):
            if prev==arr[i]:
                c+=1
            else:
                prev=arr[i]
                if c not in se:
                    se.add(c)
                    c = 1
                else :
                    return False
        if c not in se:
            return True
        return False