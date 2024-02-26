/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Boolean flag = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        find(p,q);
        return flag;
    }
    public void find(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return ;
        if(p==null && q!=null){
            flag=false;
            return;
        }
        if(q==null && p!=null){
            flag=false;
            return;
        }
        if(p.val!=q.val){
            flag=false;
            return;
        }
        find(p.left,q.left);
        find(p.right,q.right);
    }
}