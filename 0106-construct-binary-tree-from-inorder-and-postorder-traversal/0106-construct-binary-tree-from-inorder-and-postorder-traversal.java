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
    public static TreeNode buildTree(int inorder[], int preorder[]) {

        Map<Integer, Integer> map = new HashMap<>(); //

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        
        
        return createTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private static TreeNode createTree(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        if(postStart > postEnd || inStart > inEnd){
            return null;
        }

        int val = postorder[postEnd];
        TreeNode root = new TreeNode(val);
        int inRoot = map.get(val);
        int size = inRoot - inStart;

        root.left = createTree(postorder, postStart , postStart + size - 1, inorder, inStart, inRoot - 1, map);
        root.right = createTree(postorder, postStart + size, postEnd - 1, inorder, inRoot + 1, inEnd, map);
        return root;
    }
}