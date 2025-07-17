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
    public TreeNode solve(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null)
            return node;

        if (root.val < val) {
            if (root.right == null)
                root.right = node;
            else
                solve(root.right, val);
        }

        else {
            if (root.left == null)
                root.left = node;

            else {
                solve(root.left, val);
            }
        }

        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        return solve(root, val);

        

    }
}