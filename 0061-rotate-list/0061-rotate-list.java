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
        
        if(head == null){
            return null;
        }
        
        ListNode curr = head;
        int count = 0;

        if(k == 0){
            return head;
        }

        while(curr != null){
            count++;
            curr = curr.next;
        }

        k = k % count; // so we don't overdo it

        

        curr = head;
        ListNode prev = curr;
        
        if(k == 0){
            return head;
        }

        int i = 0;
        while(i < count - k){
            prev = curr;
            curr = curr.next;
            i++;
        }
        

        //System.out.println(prev.data);
        //System.out.println(curr.data);
        ListNode newHead = curr;
        
        while(curr.next != null){
            curr = curr.next;
        }
        
        // break the link
        prev.next = null;
        
        // join the new link
        curr.next = head;
        

        return newHead;
    }
}