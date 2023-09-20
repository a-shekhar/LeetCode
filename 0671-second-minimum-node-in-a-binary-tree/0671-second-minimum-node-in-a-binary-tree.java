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
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        set = inorder(root, set);
        list.addAll(set);
        Collections.sort(list);
        if(list.size()< 2){
             return -1;
        }
        return list.get(1);
    }

    private Set<Integer> inorder(TreeNode root, Set<Integer> set){
        if(root == null){
            return set;
        }
        inorder(root.left, set);
        set.add(root.val);
        inorder(root.right, set);
        return set;
    }
}