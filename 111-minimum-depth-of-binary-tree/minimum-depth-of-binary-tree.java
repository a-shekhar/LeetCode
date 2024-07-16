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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size;
        TreeNode popped;
        int minDepth = 0;
        while(!queue.isEmpty()){
            size = queue.size();
            minDepth++;  // increment minDepth for each level.
            for(int i = 0; i < size; i++){
                popped = queue.poll();
                if(popped.left == null && popped.right == null){
                    return minDepth;
                }
                if(popped.left!= null){
                    queue.offer(popped.left);
                }
                if(popped.right!= null){
                    queue.offer(popped.right);
                }
            }
        }
        return minDepth;
    }
}