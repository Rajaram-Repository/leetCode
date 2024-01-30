class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        i = 0
        while len(tokens)!=1 :
            if tokens[i] in "+-*/":
                tokens[i] = self.cal(tokens[i-2],tokens[i-1],tokens[i])
                del tokens[i-1]
                del tokens[i-2]
                i=i-2
            else:
                i+=1
        return int(tokens[0])
    def cal(self,a,b,c):
        a = int(a)
        b = int(b)
        if c=="+":
            return str(a+b)
        elif c=="-":
            return str(a-b)
        elif c=="*":
            return str(a*b)
        return str(int(a/b))
        