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
    int count = 0;
    public int goodNodes(TreeNode root) {
        inorder(root,Long.MIN_VALUE);
        return count;
    }
    private void inorder(TreeNode node,long max){
        if(node == null)
            return;
            if(node.val >= max){
                count++;
                max = node.val;
            }
            inorder(node.left,max);
            inorder(node.right,max);

    }
}