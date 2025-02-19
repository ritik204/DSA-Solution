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
    public List<Integer> rightSideView(TreeNode root) {
          if(root == null){
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>(); 
        q.add(root);
        int currLevel = 0;
        
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0;i < len;i++){
                 TreeNode node = q.poll();
                 if(i == len -1)
                    list.add(node.val);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);

            }

        }

        return list;
        
    }
}