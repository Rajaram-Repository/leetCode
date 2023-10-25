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
    int list [] = new int[10001];
    int level = 0;
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<Integer>();
         Arrays.fill(list,Integer.MIN_VALUE);
         int j = 0;
         res(j,root);
         List <Integer> n = new ArrayList<>();
         for(int i=0;i<=level;i++)
             n.add(list[i]);
         return n;
    }
    public void res(int i,TreeNode root){
        if(root==null)
            return;
        list[i]=Math.max(list[i],root.val);
        level= Math.max(level,i);
        res(i+1,root.left);
        res(i+1,root.right);
    }
}