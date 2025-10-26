/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            int val = root.val;
            if(val > p.val && val > q.val){
                root = root.left;
            } else if(val < p.val && val < q.val){
                root = root.right;
            } else {
                return root;
            }
       }

       return root;
    }
}