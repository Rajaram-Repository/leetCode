class MyQueue:

    def __init__(self):
        self.index = -1
        self.arr = []
        self.front = 0

    def push(self, x: int) -> None:
        self.arr.append(x)
        self.index +=1
        

    def pop(self) -> int:
        res = self.arr[self.front]
        self.front +=1
        self.index -=1
        return res

    def peek(self) -> int:
        return self.arr[self.front]

    def empty(self) -> bool:
        return True if self.index==-1 else False


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()