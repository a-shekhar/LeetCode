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
    public int minDiffInBST(TreeNode root) {
        int minValue = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        list = inorder(root, list);
        
        for(int i = 1; i < list.size(); i++){
            minValue = Math.min(list.get(i) - list.get(i-1), minValue);
        }
        return minValue;
    }

    public List<Integer> inorder(TreeNode root, List<Integer> list) {
        if(root == null){
            return list;
        }
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        return list;
    }
}