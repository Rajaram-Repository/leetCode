class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        c=0
        d=0
        s=s.lower()
        mid = len(s)//2
        a = s[:mid]
        b = s[mid:]
        for i in range(len(a)):
            if a[i] in "aeiou":
                c+=1
            if b[i] in "aeiou":
                d+=1               
        
        if c==d:
            return True
        return False