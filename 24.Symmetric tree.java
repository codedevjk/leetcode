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
    boolean preOrder(TreeNode leftNode, TreeNode rightNode){
        if(leftNode==null || rightNode==null)
            return (leftNode==rightNode);
        if(leftNode.val!=rightNode.val)
            return false;
        if(!preOrder(leftNode.left,rightNode.right) || !preOrder(leftNode.right,rightNode.left))
            return false;
        return true;
        
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode rootLeft=root.left;
        TreeNode rootRight=root.right;
        return preOrder(rootLeft,rootRight);
    }
}