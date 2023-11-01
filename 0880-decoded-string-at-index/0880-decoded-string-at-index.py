class Solution:
    def decodeAtIndex(self, s: str, k: int) -> str:
        length = 0  
        s0 = 0  
        for i, c in enumerate(s):
            if c.isalpha():
                length += 1 
                if k == length:
                    return c
            else: 
                length *= int(c) 

            if k <= length: 
                s0=i
                break

        for i in range(s0, -1, -1):
            c = s[i]
            k %= length
            if k == 0 and c.isalpha():
                return c
            if c.isdigit(): 
                length //= int(c)
            else :
                length -= 1 
        return "X" 