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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        List<Integer> levelOrder = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size;

        while (!queue.isEmpty()) {
            levelOrder = new ArrayList<>();
            size = queue.size();
                        
            for(int i = 0; i < size; i++){
            TreeNode poppedItem = queue.poll();
            levelOrder.add(poppedItem.val);
            if(poppedItem.left != null){
                queue.add(poppedItem.left);
            }

            if(poppedItem.right != null){
                queue.add(poppedItem.right);
            }
          }
          result.add(levelOrder);
        }


        return result; 
    }
}