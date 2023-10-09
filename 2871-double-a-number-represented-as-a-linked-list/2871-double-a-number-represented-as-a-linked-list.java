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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        ListNode prev = reverse(curr);
        ListNode temp;
        int carry = 0;
        ListNode ans = null;
        int value;
        while(prev != null){
            value = (prev.val * 2) + carry;
            temp = new ListNode(value % 10);
            carry = value/10;
            temp.next = ans;
            ans = temp;
            prev = prev.next;
        }
        if(carry == 1){
            temp = new ListNode(1);
            temp.next = ans;
            ans = temp;
        }
        return ans;
    }

    private ListNode reverse(ListNode curr){
        ListNode temp;
        ListNode prev = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}