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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }

        k  = k % count;
        int i = 0;
        while(i < k){
            curr = head.next;
            ListNode prev = head;
            while(curr.next != null){
                curr = curr.next;
                prev = prev.next;
            }
           
            curr.next = head;
            head = curr;
            prev.next = null;
            i++;
        }
        return head;
    }
}