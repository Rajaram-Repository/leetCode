class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        c = 1
        val = arr[len(arr)-1]
        maxC =1
        for i in range(1,len(arr)):
            if arr[i-1] == arr[i]:
                c+=1
                print("if",i,c)
            else:
                print("else",i,c,maxC,val)
                if maxC<c:
                    val=arr[i-1]
                    maxC=c
                c=1
        if maxC<c:
            return arr[len(arr)-1]
        return val
                
        