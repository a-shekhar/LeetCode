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
        List<Integer> level;
        queue.offer(root);
        TreeNode popped;
        int size;
        while(!queue.isEmpty()){
            level =  new ArrayList<>();
            size = queue.size();
            for(int i = 0; i < size; i++){
                popped = queue.poll();
                level.add(popped.val);
                if(popped.right != null){
                    queue.offer(popped.right);
                }

                if(popped.left != null){
                    queue.offer(popped.left);
                }

            }
            //if(level.size() > 0){
                result.add(level.get(0));
            //}
        } 

        return result;
    }
}