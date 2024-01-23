class Solution:
    def maxLength(self, arr: List[str]) -> int:
        result = [0]
        self.dfs(arr, "", 0, result)
        return result[0]

    def dfs(self, arr, path, idx, result):
        flag1= len(path)
        flag2= len(set(path))
        result[0] = len(path) if result[0]<flag1 and flag1 == flag2 else result[0]
        if idx == len(arr) or flag1 != flag2 :
            return

        for i in range(idx, len(arr)):
            self.dfs(arr, path + arr[i], i + 1, result)
