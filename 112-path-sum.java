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
     private boolean dfs(TreeNode root, int tar, int sum)
    {
        
        if(root == null) return false;
        
        if(root.left == null && root.right == null)
        {
            if(sum + root.val == tar) return true;
            
            return false;
        }
        
        if(dfs(root.left, tar, sum + root.val)) return true;
        
        if(dfs(root.right, tar, sum + root.val)) return true;
        
        return false;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return dfs(root, targetSum, 0);
        
    }
}