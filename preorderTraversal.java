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
    private void postorder(TreeNode root, List<Integer> list) {
        if(root==null) return;
        list.add(root.val);
        postorder(root.left,list);
        postorder(root.right,list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // while (root != null) {
        //     list.add(root.val);
        //     root = root.left;
        //     root = root.right;
        // }
        postorder(root,list);

        return list;
    }
}