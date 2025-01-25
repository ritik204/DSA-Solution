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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
         List<List<Integer>> res = new ArrayList<>();
         if(root == null)
            return res;
        q.add(root);
        while(q.size()>0){
        List<Integer> list = new ArrayList<>();
        int level = q.size();
            for (int i = 0; i < level; i++) {
                TreeNode current = q.poll();
                list.add(current.val);

                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }

            if(res.size() % 2 != 0) Collections.reverse(list);

            res.add(list);

        }
        return res;
            
        
    }
}