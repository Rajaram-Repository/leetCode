# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        deque =[root]
        d = {}
        while deque :
            i = deque.pop()
            if i.val in d :
                d[i.val] +=1
            else:
                d[i.val] = 1
            if i.left :
                deque.append(i.left)
            if i.right:
                deque.append(i.right)
        m = max(d.values())
        list = []
        for key,value in d.items():
            if m==value:
                list.append(key)
        return list
        
            