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
    
    Map<String, Integer> map;
    List<TreeNode> result;
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        //Brutal force way: do dfs, bfs for search to save subtree of every single node and compare. time: n^3
        //going from bottom to top, save the string into map
        
        System.out.println(root.val);
        map = new HashMap<>();
        result = new ArrayList<>();
        traverse(root);
        return result;
    }
    
    public String traverse(TreeNode node){
        if(node == null){
            return "$";
        }
        
        String subpath = node.val + "," + traverse(node.left) + "," + traverse(node.right);
        
        System.out.println(subpath);
        map.put(subpath, map.getOrDefault(subpath, 0) + 1);
        
        if(map.get(subpath) == 2){
            result.add(node);
        }
        
        return subpath;
    }
}