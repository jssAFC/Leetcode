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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        int l=0,r=nums.length-1;
        
        return solve(nums,l,r);
    }

    public TreeNode solve(int[] nums,int l,int r){
        if(l>r) return null;

        int mid=(r-l)/2+l;
        TreeNode root=new TreeNode(nums[mid]);

        root.left=solve(nums,l,mid-1);
        root.right=solve(nums,mid+1,r);

        return root;
    }


}