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
     public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode curr  = root;
        TreeNode temp = new TreeNode(val);
        if(curr == null){
            root = temp;
            return root;
        }
        while(true){
            if(val  < curr.val){
                if(curr.left == null){
                    curr.left = temp;
                   break;
                }
                curr = curr.left;
            }else{
                if(curr.right == null){
                    curr.right = temp;
                    break;
                }
                curr = curr.right;
            }
        }
        return root;
    }
}