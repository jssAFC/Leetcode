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
    public int maxDepth(TreeNode root) {
        int depth=0;
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            depth++;

            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode top=q.poll();
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
        }

        return depth;
    }
}