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
    // private void solve(TreeNode root,List<Integer> list){
    //     Queue<TreeNode> q=new LinkedList<>();
    //     q.offer(root);
    //     while(!q.isEmpty()){
    //         list.add(q.peek().val);
    //         if(q.peek().left!=null) q.offer(q.peek().left);
    //         if(q.peek().right!=null) q.offer (q.peek().right);
    //         q.remove();
    //     }
    // }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // List<Integer> list1=new ArrayList<>();
        // List<Integer> list2=new ArrayList<>();

        // solve(p,list1);
        // solve(q,list2);
        // return list1.equals(list2);

        if(p==null || q==null) return p==q;
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}