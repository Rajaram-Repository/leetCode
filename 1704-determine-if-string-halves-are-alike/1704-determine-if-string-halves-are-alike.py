class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        s=s.lower()
        mid = len(s)//2
        c=0
        d=0
        for i in range(mid):
            if s[i] in "aeiou":
                c+=1
            if s[mid+i] in "aeiou":
                d+=1               
        
        if c==d:
            return True
        return False