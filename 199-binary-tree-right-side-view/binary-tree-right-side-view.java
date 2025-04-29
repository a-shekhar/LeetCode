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
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
       
        Queue<TreeNode> queue = new LinkedList<>();
        int currVal = 0;
        queue.offer(root);
        TreeNode popped;
        int size;
        while(!queue.isEmpty()){
            size = queue.size();
            for(int i = 0; i < size; i++){
                popped = queue.poll();
                currVal = popped.val;

                if(popped.left != null){
                    queue.offer(popped.left);
                }

                if(popped.right != null){
                    queue.offer(popped.right);
                }
                
            }
            
            result.add(currVal);
            
        } 

        return result;
    }
}