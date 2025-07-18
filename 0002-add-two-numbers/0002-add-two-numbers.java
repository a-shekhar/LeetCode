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
        int val1, val2, sum, rem, carry  = 0;

        ListNode res = new ListNode();
        ListNode temp;
        ListNode curr = res;

        while(l1 != null || l2 != null || carry != 0){
            val1 = (l1 == null ? 0 : l1.val);
            val2 = (l2 == null ? 0 : l2.val);

            sum = carry + val1 + val2;

            carry = sum / 10;
            rem = sum % 10;

            temp = new ListNode(rem);

            curr.next = temp;
            curr = curr.next;

            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);
        }

        return res.next;
    }
}