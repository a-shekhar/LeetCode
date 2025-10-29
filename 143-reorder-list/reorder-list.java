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
    public void reorderList(ListNode head) {
        if(head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;
        while(fast.next != slow){
            fast = fast.next;
        }

        fast.next = null;

        // reveres the linked list 
        ListNode prev = null;
        ListNode  curr = slow;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // while(head != null) {
        //     System.out.println(head.val);
        //     head = head.next;
        // }

        // while(prev != null) {
        //     System.out.println(prev.val);
        //     prev = prev.next;
        // }

         curr = head;
        while(curr.next != null && prev != null){
            ListNode nextNode  = curr.next;
            ListNode prevHead = prev.next;
            curr.next = prev;
            prev.next = nextNode;
            prev = prevHead;
            curr = nextNode;
        }

        if(prev != null){
            curr.next = prev;
        }
    }
}