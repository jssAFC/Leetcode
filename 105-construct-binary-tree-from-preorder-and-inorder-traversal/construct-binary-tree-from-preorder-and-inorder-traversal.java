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
   int idx=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;

        return solve(inorder,postorder,0,n-1);
    }

    public TreeNode solve(int[] inorder, int[] postorder,int start,int end){
        if(start>end) return null;

        int val=inorder[idx];
        idx++;
        TreeNode head=new TreeNode(val);
        int i;
        for(i=start;i<=end;i++) if(postorder[i]==val) break;

        head.left=solve(inorder,postorder,start,i-1);
        head.right=solve(inorder,postorder,i+1,end);

        return head;
    }
}