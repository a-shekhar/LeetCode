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
     public ListNode partition(ListNode head, int x) {
        if(head == null){
            return head;
        }
        ListNode head1 = new ListNode(-1);
        ListNode head2 = new ListNode(-1);
        ListNode tail1 = head1;
        ListNode tail2 = head2;

        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = null; // remove the cycle  
            if(curr.val < x){
                tail1.next = curr;
                tail1 = curr; 
            } else {
                    tail2.next = curr;
                    tail2 = curr; 
                }
            
            curr = next;
        }
        
        tail1.next = head2.next;
        return head1.next;
    }
}