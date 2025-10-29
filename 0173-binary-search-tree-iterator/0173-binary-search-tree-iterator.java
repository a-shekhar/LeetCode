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
Stack<Integer> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        inorder(root, stack);
        //System.out.println(stack);
    }
    
    public int next() {
        return stack.pop();
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void inorder(TreeNode root, Stack<Integer> stack){
        if(root == null) return;
         inorder(root.right, stack);
         stack.push(root.val);
         inorder(root.left, stack);
    }

}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */