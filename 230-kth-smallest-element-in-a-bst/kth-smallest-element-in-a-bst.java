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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }   

        ArrayList<Integer> list = new ArrayList<Integer>();
        list = inorder(root, list);
        return list.get(k-1);
    }

    private ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return new ArrayList<>();
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        return list;
    }
}