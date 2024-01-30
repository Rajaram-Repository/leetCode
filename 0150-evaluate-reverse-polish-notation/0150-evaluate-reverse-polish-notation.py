class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        i = 0
        stack = []
        ops = {
            "+": lambda a, b: a + b,
            "-": lambda a, b: b-a,
            "/": lambda a, b: int(b / a),
            "*": lambda a, b: a * b
        }
        for i in tokens:
            if i.isnumeric() or (i[0] == '-' and i[1:].isnumeric()):
                stack.append(int(i))
            else:
                stack.append(str(ops[i](int(stack.pop()), int(stack.pop()))))
        
        return int(stack[0])
