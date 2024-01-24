# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pseudoPalindromicPaths (self, root: Optional[TreeNode]) -> int:
        self.count = 0
        self.res(root,set())
        return self.count
                
    def res(self,root,new_l):
        if not root:
            return
        if root.val in new_l:
            new_l.remove(root.val)
        else:
            new_l.add(root.val)
        if not root.left and not root.right and len(new_l)<=1 :
            self.count+=1
        self.res(root.left,set(new_l))
        self.res(root.right,set(new_l))

        
            
            