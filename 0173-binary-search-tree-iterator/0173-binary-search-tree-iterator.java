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
class BSTIterator {
     Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        //inorder(root, stack);
        pushLeft(root, stack);
        //System.out.println(stack);
    }
    
    public int next() {
        TreeNode curr = stack.pop();
        if(curr != null) pushLeft(curr.right, stack);
        return curr.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushLeft(TreeNode root, Stack<TreeNode> stack){
        while(root != null) {
            stack.push(root);
            root = root.left;
        }
    }

}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */