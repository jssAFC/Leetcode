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
    private boolean sol(TreeNode p,TreeNode q){
        if(p==null || q==null) return p==q;

        return p.val==q.val && sol(p.left,q.right) && sol(p.right,q.left);
    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode p,q;
        p=q=root;
        return sol(p,q);
    }
}