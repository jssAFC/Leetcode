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
    int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
    boolean different=false;
    public int findSecondMinimumValue(TreeNode root) {

        solve(root);
        return different?smin:-1;

    }

    public void solve(TreeNode root){
        if(root==null) return;

        if(root.val<min){
            if(min!=Integer.MAX_VALUE){
                smin=min;
                different=true;
            }
            min=root.val;
        }
        else if(root.val>min && root.val<=smin){
            smin=root.val;
            different=true;
        }

        solve(root.left);
        solve(root.right);
    }
}