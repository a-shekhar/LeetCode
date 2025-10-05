/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
        private int getLength(ListNode head){
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            curr = curr.next;
            count++;
        }
        return count;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        if(lenA > lenB){
            while(lenA != lenB){
                headA = headA.next;
                lenA--;
            }
        }

        if(lenB > lenA){
            while(lenA != lenB){
                headB = headB.next;
                lenB--;
            }
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}