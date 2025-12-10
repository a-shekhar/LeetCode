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
   public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = new TreeNode();
        return root = solve(root1, root2, root);
    }

    private TreeNode solve(TreeNode root1, TreeNode root2, TreeNode root) {
        if(root1 == null && root2 == null){
            return null;
        }

        int val1 = root1 == null ? 0 : root1.val;
        int val2 = root2 == null ? 0 : root2.val;

        root = new TreeNode(val1 + val2);

        TreeNode left1 = root1 != null ? root1.left : null;
        TreeNode left2 = root2 != null ? root2.left : null;

        root.left = solve(left1, left2, root);

        TreeNode right1 = root1 != null ? root1.right : null;
        TreeNode right2 = root2 != null ? root2.right : null;

        root.right = solve(right1, right2, root);
        
        return root;
    }
}