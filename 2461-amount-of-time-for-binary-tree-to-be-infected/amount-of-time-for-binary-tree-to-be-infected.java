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
    public int amountOfTime(TreeNode root, int start) {
        
        HashMap<TreeNode,List<TreeNode>> map=new HashMap<>();
        Set<TreeNode> set=new HashSet<>();

        solve(root,map,null);

        Queue<TreeNode> q=new LinkedList<>();

        for(TreeNode node:map.keySet()) if(node.val==start){
            set.add(node);
            q.offer(node);
            break;
        }

        int time=0;

        while(!q.isEmpty()){
            int size=q.size();
            boolean flag=false;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                for(TreeNode tree:map.get(node)){
                    if(!set.contains(tree)){
                        q.offer(tree);
                        set.add(tree);
                        flag=true;
                    } 
                }

            }
                if(flag) time++;
        }

        return time;
    }

    public void solve(TreeNode root,HashMap<TreeNode,List<TreeNode>> map,TreeNode parent){
        if(root==null) return;
        map.put(root,new ArrayList<>());
        if(parent!=null) map.get(root).add(parent);

        if(root.left!=null) map.get(root).add(root.left);
        if(root.right!=null) map.get(root).add(root.right);

        solve(root.left,map,root);
        solve(root.right,map,root);
    }
}