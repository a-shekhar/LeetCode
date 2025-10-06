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
    public int sumNumbers(TreeNode root) {
        ArrayList<String> paths = new ArrayList<>();
        //ArrayList<ArrayList<Integer>> paths = new ArrayList<>();

        dfs(root, "", paths);


                return paths.stream().map(x -> Integer.valueOf(x)).reduce(Integer::sum).get();

    }

    private void dfs(TreeNode root,  String path, ArrayList<String> paths){
        if(root == null){
            return;
        }

        path += root.val;
        //System.out.println(path);


        if(root.left == null && root.right == null){
            paths.add(path);
            return;
        }

        dfs(root.left, path, paths);
        dfs(root.right, path, paths);
        
    }
}