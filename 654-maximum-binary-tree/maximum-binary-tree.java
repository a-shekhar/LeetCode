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
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;  i < nums.length; i++){
            map.put(nums[i], i);
        }
        return construct(0, nums.length, nums, map);
    }
   

    public TreeNode construct(int start, int end, int[] nums, Map<Integer, Integer> map){
        if(start >= end){
            return null;
        }

        int maxVal = Integer.MIN_VALUE;
        for(int i = start;  i < end; i++){
            maxVal = Math.max(nums[i], maxVal);
        }

        TreeNode root = new TreeNode(maxVal);
        int index = map.get(maxVal);

        root.left = construct(start, index, nums, map);
        root.right = construct(index + 1, end , nums, map);
        return  root;
    }
}