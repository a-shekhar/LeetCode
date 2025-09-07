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
        int carry = 0;
        ListNode dummy  = new ListNode(-1);
        ListNode tail = dummy;

        int sum, val1, val2 = 0;
        ListNode temp;
        while(l1 != null || l2 != null){
            val1 = (l1 != null) ? l1.val : 0;
            val2 = (l2 != null) ? l2.val : 0;
            sum = val1 + val2 + carry;
            
            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            carry = sum / 10;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        if(carry > 0){
            tail.next = new ListNode(carry);
        }

        return dummy.next;
    }
}