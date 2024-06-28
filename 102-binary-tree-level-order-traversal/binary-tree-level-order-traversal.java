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
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> level = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            level = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode popped = queue.poll();
                level.add(popped.val);
                if(popped.left != null){
                    queue.offer(popped.left);
                }
                if(popped.right != null){
                    queue.offer(popped.right);
                }
            }
            result.add(new ArrayList<>(level));
        }
        return result;
    }
}