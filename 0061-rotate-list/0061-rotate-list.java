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
        if(head == null || head.next == null || k == 0){
            return head;
        }

        int count = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            count++;
        }

        k = k % count;
        if(k == 0){
            return head;
        }
        
        int i = 1;

        ListNode prev = head;
        curr = head.next;
        int x = (count - k);
        while(i < x){
            prev = prev.next;
            curr = curr.next;
            i++;
        }


        ListNode newNode = curr;
        while(newNode != null && newNode.next != null){
            newNode = newNode.next;
        }

        newNode.next = head;
        prev.next = null;
        head = curr;
        System.out.println(curr.val);


        return head;
    }
}