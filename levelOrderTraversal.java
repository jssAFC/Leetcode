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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;

        q.add(root);
        while(!q.isEmpty()){
            int levels=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<levels;i++){
                if(q.peek().left!=null) {
                    q.add(q.peek().left);
                }

                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                temp.add(q.remove().val);
            }

            res.add(temp);
        }

        return res;
    }
}