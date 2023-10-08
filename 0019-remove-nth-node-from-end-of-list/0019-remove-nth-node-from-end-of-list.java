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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 1;
        while(count <= n){
            curr = curr.next;
            count++;
        }

        if(curr == null){
            return head.next;
        }
        
        ListNode prev = head;
        while(curr != null && curr.next != null){
            prev = prev.next;
            curr = curr.next;
        }

        System.out.print(prev);
        prev.next = prev.next.next;
        return head;
    }
}