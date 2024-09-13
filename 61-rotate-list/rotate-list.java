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
        if(head == null) {
            return null;
        }
        int size = 0;
        ListNode currentNode = head;
        ListNode tail = new ListNode();
        while(currentNode != null){
            tail = currentNode;
            currentNode = currentNode.next;
            size++;
        }
       
        k = k % size;
        //System.out.print(k);
        int rotate = 0;
        ListNode prevNode;
        while (rotate < k) {
            currentNode = head;
            prevNode = new ListNode();
            while(currentNode != tail) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            tail.next = head;
            head = tail;
            prevNode.next = null;
            tail = prevNode;
            rotate++;
        }
        return head;
    }
}