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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;  i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        int n = preorder.length;
        return createTree(preorder, 0, n-1, inorder, 0, n-1, map);
    }

    private TreeNode createTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        int val = preorder[preStart];
        int index = map.get(val);
        int size = index - inStart;// dummy

        TreeNode root = new TreeNode(val);
        root.left = createTree(preorder, preStart + 1, preStart + size, inorder, inStart, index - 1, map);
        root.right = createTree(preorder, preStart + size + 1, preEnd, inorder, index + 1, inEnd, map);
        return root;
    }
}