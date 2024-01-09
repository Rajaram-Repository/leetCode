# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        return self.bts(root1)==self.bts(root2)
    def bts(self,root):
        if not root: return []
        if not (root.right or root.left): return [root.val]
        return self.bts(root.right)+self.bts(root.left)