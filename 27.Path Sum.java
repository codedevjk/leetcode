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
    public boolean hasPathSum(TreeNode root, int Sum) {
        if(root==null)
            return false;
        Sum=Sum-root.val;
        if(root.left==null && root.right==null)
        {
            if(Sum==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        } 
        return hasPathSum(root.left,Sum) || hasPathSum(root.right,Sum);

        
        
        
    }
}