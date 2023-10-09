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
        ListNode node1 = reverse(l1);
        ListNode node2 = reverse(l2);
        int carry = 0;
        ListNode ans = null;
        int val1 = 0;
        int val2 = 0;
        int sum = 0;
        ListNode temp;
        while(node1 != null || node2 != null){
            val1  = node1 != null ? node1.val : 0;
            val2  = node2 != null ? node2.val : 0;
            sum = val1 + val2 + carry;
            temp = new ListNode(sum % 10);
            carry = sum / 10;
            temp.next = ans;
            ans = temp;
            
            node1 = node1 != null ? node1.next : null;
            node2 = node2 != null ? node2.next : null;
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