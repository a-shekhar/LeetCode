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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null) {
            return head;
        }

        if(head.next.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode curr = head.next.next;
        ListNode odd1 = odd;
        ListNode even1 = even;
        ListNode temp;
        int n = 3;
        while(curr != null){            
            if(n % 2 != 0){
                odd.next = curr;
                odd = odd.next;
            }else{
                even.next = curr;
                even = even.next;
               
            }
            n++;
            curr = curr.next;
        }
        
        odd.next = even1;
        even.next = null;
        return odd1;
    }
}