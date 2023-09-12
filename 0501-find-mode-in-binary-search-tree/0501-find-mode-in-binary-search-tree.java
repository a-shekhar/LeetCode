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
    public int[] findMode(TreeNode root) {
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        list = inorder(root, map, list);
       
        Collections.sort(list);
        int max = list.get(list.size() - 1);
        list =  new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                list.add(entry.getKey());
            }
        }
        int[] arr = new int[list.size()];
        int i = 0;
        for(int num : list){
            arr[i] = list.get(i);
            i++;
        }
        return arr;
    }

    public List<Integer> inorder(TreeNode root, Map<Integer, Integer> map, List<Integer> list){
        if(root == null){
            return list;
        }

        inorder(root.left, map, list);
        map.putIfAbsent(root.val, 0);
        map.put(root.val, map.get(root.val) + 1);
        list.add(map.get(root.val));
        
        inorder(root.right, map, list);
        return list;
    }
}