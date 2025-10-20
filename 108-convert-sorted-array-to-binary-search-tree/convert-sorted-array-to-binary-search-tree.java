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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length);
    }

    private TreeNode createTree(int[] nums, int start, int end) {
        if(start < 0 || end > nums.length || start >= end){
            return null;
        }

        int half = (start + end) /2;
        TreeNode root = new TreeNode(nums[half]);

        root.left = createTree(nums, start, half);
        root.right = createTree(nums, half + 1, end);
        return root;
    }
}