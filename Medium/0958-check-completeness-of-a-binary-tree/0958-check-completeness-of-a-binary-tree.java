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
    public boolean isCompleteTree(TreeNode root) {
        //bfs
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean nullSeen = false;
        
        while(!q.isEmpty()){
            TreeNode tmp = q.poll();
            if(tmp == null) nullSeen = true;
            else {
                if(nullSeen) return false;
                q.offer(tmp.left);
                q.offer(tmp.right);
            }
        }
        
        return true;
    }
}