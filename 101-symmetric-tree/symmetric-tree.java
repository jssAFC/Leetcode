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
    public boolean isSymmetric(TreeNode root) {
        return solve(root.left,root.right);
    }

    public boolean solve(TreeNode leftnode,TreeNode rightnode){
        if(leftnode==null && rightnode==null) return true;
        if(leftnode==null || rightnode==null) return false;

        return leftnode.val==rightnode.val && solve(leftnode.left,rightnode.right) && solve(leftnode.right,rightnode.left);
    }
}