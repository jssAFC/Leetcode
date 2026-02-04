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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Integer dia=0;
        solve(root,dia);
        return max;

    }

    public int solve(TreeNode root,Integer dia){
        if(root==null) return 0;
        int leftDia=solve(root.left,dia);
        int rightDia=solve(root.right,dia);
        max=Math.max(max,leftDia+rightDia);
        return 1+Math.max(leftDia,rightDia);
    }
}