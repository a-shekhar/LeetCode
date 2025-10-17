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
class FindElements {

    
    Set<Integer> set = new HashSet<>();

    public FindElements(TreeNode root) {
        int rootVal = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                rootVal = curr.val;
                set.add(rootVal);
                if(curr.left != null){
                    curr.left.val = (2 * rootVal) + 1;
                    queue.offer(curr.left);
                }

                if(curr.right != null){
                    curr.right.val = (2 * rootVal) + 2;
                    queue.offer(curr.right);
                }
            }
        }
        //System.out.println(root.toString());
    }
    
    public boolean find(int target) {
        return set.contains(target); 
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */