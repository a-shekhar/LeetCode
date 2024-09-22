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
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> levelOrder = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isEven = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            levelOrder =  new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                if(!isEven){
                   levelOrder.add(0, currentNode.val);
                }else{
                    levelOrder.add(currentNode.val);
                }
                if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            
            isEven =!isEven;
            result.add(levelOrder);
        }
        return result;
    }
}