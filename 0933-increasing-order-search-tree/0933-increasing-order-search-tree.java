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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = inorder(root, list);
        TreeNode head = makeTree(root, list);
        return head;
    }

    private TreeNode makeTree(TreeNode root,  List<Integer> list){
        TreeNode head = new TreeNode(list.get(0));
        TreeNode curr = head;
        for(int i = 1;  i < list.size(); i++){
            TreeNode node = new TreeNode(list.get(i));
            curr.right = node;
            curr = node;
        }
        return head;
    }

    private List<Integer> inorder(TreeNode root, List<Integer> list){
        if(root == null){
            return list;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        return list;
    }
}