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
    public boolean isSymmetric(TreeNode root) {
       // iterative
        
        if(root == null) return true;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode p = queue.poll();
            TreeNode q = queue.poll();
            
            if((p == null) && (q == null))continue;
            if((p == null) || (q == null) || q.val != p.val) return false;
            
            queue.add(p.left); queue.add(q.right); //one set 
            queue.add(q.left); queue.add(p.right);
        }
        
        return true;
    }
}