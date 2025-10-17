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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(0, nums.length, nums);
    }
   

    public TreeNode construct(int start, int end, int[] nums){
        if(start >= end){
            return null;
        }

        int maxVal = Integer.MIN_VALUE;
        int index = -1;
        for(int i = start;  i < end; i++){
            if(nums[i] > maxVal){
                maxVal = nums[i];
                index = i;
            }
        }

        TreeNode root = new TreeNode(maxVal);
    

        root.left = construct(start, index, nums);
        root.right = construct(index + 1, end , nums);
        return  root;
    }
   
}