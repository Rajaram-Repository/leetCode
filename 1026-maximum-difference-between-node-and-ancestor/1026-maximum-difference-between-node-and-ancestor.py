# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
        self.diff=0
        self.bfs(root,root.val,root.val)
        return self.diff
    def bfs(self,root,min_val,max_val):
        if not root:
            return
        self.diff = max(self.diff, max(abs(min_val - root.val), abs(max_val - root.val)))
        min_val = min(min_val, root.val)
        max_val = max(max_val, root.val)
        self.bfs(root.left, min_val, max_val)
        self.bfs(root.right, min_val, max_val)
        


        