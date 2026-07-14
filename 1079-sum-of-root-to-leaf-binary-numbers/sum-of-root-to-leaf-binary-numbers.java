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
    public int sumRootToLeaf(TreeNode root) {
        return solve(root,"");
    }

    public int solve(TreeNode root,String num){
        if(root==null) return 0;
        num+=root.val;
        if(root.left==null && root.right==null) return Integer.parseInt(num,2);
        return solve(root.left,num) + solve(root.right,num);
    }
}