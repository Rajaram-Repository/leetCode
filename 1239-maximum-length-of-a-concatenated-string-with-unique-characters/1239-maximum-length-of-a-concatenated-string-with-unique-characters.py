class Solution:
    def maxLength(self, arr: List[str]) -> int:
        result = [0]
        self.dfs(arr, "", 0, result)
        return result[0]

    def dfs(self, arr, path, idx, result):
        if result[0]<len(path) and len(path) == len(set(path)):
            result[0] =len(path)
        if idx == len(arr) or len(path) != len(set(path)):
            return

        for i in range(idx, len(arr)):
            self.dfs(arr, path + arr[i], i + 1, result)

