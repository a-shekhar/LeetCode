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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(); 
        ListNode curr = head;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int digit1 = l1 != null ? l1.val : 0; 
            int digit2 = l2 != null ? l2.val : 0; 

            int num = digit1 + digit2 + carry;
            int digit = num % 10;
            carry = num / 10;
            
            ListNode temp = new ListNode(digit);
            curr.next = temp;
            curr = curr.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

        } 
        return head.next;
    }
}