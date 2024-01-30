class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        i = 0
        stack = []
        for i in tokens :
            if i in "+-*/":
                b=stack.pop()
                a=stack.pop()
                stack.append(self.cal(a,b,i))
            else:
                stack.append(i)
        return int(stack[0])
    def cal(self, a, b, c):
        a = int(a)
        b = int(b)
        ops = {
            "+": lambda a, b: a + b,
            "-": lambda a, b: a - b,
            "/": lambda a, b: int(a / b),
            "*": lambda a, b: a * b
        }
        result = ops[c](a,b)
        return str(result)
