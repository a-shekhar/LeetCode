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
   public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        String path = "";
        findPaths(root, path, result);
        return result;
    }

    private void findPaths(TreeNode root, String path, List<String> result) {
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            path += root.val;
            result.add(path);
            return;
        }

        // append root data
         path += root.val;
         path += "->";
        // append arrow
        // builder.append("->");
        
        findPaths(root.left, path, result);
        findPaths(root.right, path, result);
        

        //builder.delete(builder.length()-3, builder.length());
    }
}