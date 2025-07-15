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
    
    boolean result=true;
    int solve(TreeNode root){
        if(root==null) return 0;



        int l=solve(root.left);
        int r=solve(root.right);

        if(Math.abs(l-r)>1){
            result=false;
            return 0;
        }

        return 1+Math.max(l,r);
        
    }

    public boolean isBalanced(TreeNode root) {
        solve(root);
        return result;
    }
}