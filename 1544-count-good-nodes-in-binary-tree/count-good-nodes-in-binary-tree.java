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
    public int goodNodes(TreeNode root) {
        int maxValue = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        calculateGoodNodes(root, maxValue, list);
        return list.size();
    }

    private void  calculateGoodNodes(TreeNode root, int maxValue, List<Integer> list) {
        if(root == null){
            return;
        }
        int rootVal = root.val;
        if(rootVal >= maxValue){
            list.add(rootVal);
        }

        maxValue = Math.max(rootVal, maxValue);

        calculateGoodNodes(root.left, maxValue, list);
        calculateGoodNodes(root.right, maxValue, list);
    }

}