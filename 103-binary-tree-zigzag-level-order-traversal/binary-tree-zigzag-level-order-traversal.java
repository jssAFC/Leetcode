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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Deque<TreeNode> q=new ArrayDeque<>();
        int level=0;
        if(root==null) return result;
        q.offerFirst(root);
        boolean reverse=false;
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                if(reverse){
                    list.add(q.getLast().val);
                    q.addFirst(q.pollLast());
                }
                else{
                    list.add(q.getFirst().val);
                    q.addLast(q.pollFirst());
                }
            }

            for(int i=0;i<size;i++){
                TreeNode node=q.pollFirst();

                if(node.left!=null) q.addLast(node.left);
                if(node.right!=null) q.addLast(node.right);
            }
            result.add(list);
            reverse=!reverse;
        }

        return result;

    }
}