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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        solve(root,list);
        // list.remove(list.size()-1);
        // for(int i:list) System.out.println(i);
        int i=0,j=list.size()-1;
        
        while(i<j){
            int left=list.get(i);
            int right=list.get(j);
            if(left+right==k) return true;
            if(left+right<k) i++;
            else j--;
        }
        
        return false;
    }

    void solve(TreeNode root,List<Integer> list){
        if(root==null) return;
        solve(root.left,list);
        list.add(root.val);
        solve(root.right,list);
    }
}