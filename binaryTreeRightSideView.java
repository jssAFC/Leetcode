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
    public void solve(TreeNode root,List<Integer> list,int index){
        if(root==null) return;

        if(list.size()==index) list.add(root.val);
        solve(root.right,list,index+1);
        solve(root.left,list,index+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        solve(root,list,0);
        return list;
    }
}