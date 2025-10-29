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
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null; // split into 2 halves 

        // reveres the linked list 
        ListNode prevNode = null;
        ListNode  curr = slow;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = temp;
        }

        
        // merge
        ListNode first = head;
        ListNode second = prevNode;
        while(first != null && second != null){
            ListNode nextNode1  = first.next;
            ListNode nextNode2 = second.next;
            first.next = second;
            if(nextNode1 == null) break;
            second.next = nextNode1;
            first = nextNode1;
            second = nextNode2;
        }
    }
}