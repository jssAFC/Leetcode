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
    private void solve(TreeNode root,int []sum,int num){
        if(root==null) return;
        num=num*10+root.val;
        if(root.left==null && root.right==null){
            sum[0]+=num;
            return;
        }

        solve(root.left,sum,num);
        solve(root.right,sum,num);
    }


    public int sumNumbers(TreeNode root) {
        int []sum=new int[1];
        solve(root,sum,0);
        return sum[0];
    }
}