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
    TreeNode left;
    TreeNode right;

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }

        while(root != null){
            if(root.val == val){
                return root;
            }
            if(val < root.val){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return null;        
    }
}