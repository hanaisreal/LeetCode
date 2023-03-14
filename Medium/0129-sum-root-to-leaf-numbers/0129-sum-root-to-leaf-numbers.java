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
    int sum = 0;
    
    public int sumNumbers(TreeNode root) {
        //depth first search until the end node
        dfs(root,"");
        return sum;
    }
    
    public void dfs(TreeNode node, String str){
        if(node == null){
            return;
        }
        str += node.val;
        if(node.left == null && node.right == null){
            sum += Integer.parseInt(str);
            return;
        }
        dfs(node.left, str);
        dfs(node.right, str);
    }
}