/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        ListNode curr = head;
        ListNode prev = new ListNode(-1);
        ListNode newHead = prev;
        while(curr != null){
            if(set.contains(curr.val)){
                prev.next = null;
                if(prev.next!=null)
                    prev = prev.next;
            }else{
                prev.next = curr;
                prev = prev.next;
            }
            
            curr = curr.next;

        }
        return newHead.next;
    }
}