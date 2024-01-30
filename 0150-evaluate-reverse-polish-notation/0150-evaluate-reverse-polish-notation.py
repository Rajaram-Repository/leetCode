class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        i = 0
        stack = []
        ops = {
            "+": lambda a, b: a + b,
            "-": lambda a, b: a - b,
            "/": lambda a, b: int(a / b),
            "*": lambda a, b: a * b
        }
        for i in tokens :
            if i in "+-*/":
                b=int(stack.pop())
                a=int(stack.pop())
                stack.append(str(ops[i](a,b)))
            else:
                stack.append(i)
        return int(stack[0])
