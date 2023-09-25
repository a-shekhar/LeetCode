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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode curr = head;
        int count = 0;
        int mid = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }

        mid = count/2;
        count = 0;
        curr = head;
        while(++count < mid){
            curr = curr.next;
        }
    
        curr.next = curr.next.next;
        return head;
    }
}