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
    public int maxDepth(TreeNode root) {
          int depth = 0;
        
        if(root == null){
            return depth;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size;
        TreeNode popped;

        while(!queue.isEmpty()){
            size = queue.size();
            depth++;
            for(int i=0; i < size; i++){
                
                popped = queue.poll();

                if(popped.left != null){
                    queue.offer(popped.left);
                }

                if(popped.right != null){
                    queue.offer(popped.right);
                }
            }
        }

        return depth;
    }
}