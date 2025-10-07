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
        ListNode head2 = null;
        ListNode tail1 = head1;
        ListNode tail2 = head2;

        ListNode curr = head;
        while(curr != null){
            ListNode newNode = new ListNode(curr.val);
            if(curr.val < x){
                tail1.next = newNode;
                tail1 = newNode; 
            } else {
                if(head2 == null){
                    head2 = newNode;
                    tail2 = newNode;
                }else{
                    tail2.next = newNode;
                    tail2 = newNode; 
                }
            }
            curr = curr.next;
        }
        
        tail1.next = head2;
        return head1.next;
    }
}