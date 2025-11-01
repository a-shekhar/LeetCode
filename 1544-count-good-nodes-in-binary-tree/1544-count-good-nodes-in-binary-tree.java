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
        return calculateGoodNodes(root, Integer.MIN_VALUE);
    }

    private int calculateGoodNodes(TreeNode root, int maxValue) {
        if(root == null){
            return 0;
        }
        int rootVal = root.val;
        int count = 0;
        if(rootVal >= maxValue){
            count = 1;
        }

        maxValue = Math.max(rootVal, maxValue);
        count += calculateGoodNodes(root.left, maxValue);
        count += calculateGoodNodes(root.right, maxValue);
        return count;
    }

}