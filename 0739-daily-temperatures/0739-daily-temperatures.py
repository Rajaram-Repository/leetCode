class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        l = len(temperatures)
        arr = [0] * l
        stack = []
        for i in range(l):
            while stack and temperatures[i] > temperatures[stack[-1]]:
                pos = stack.pop()
                arr[pos]= i-pos
            stack.append(i)
        return arr