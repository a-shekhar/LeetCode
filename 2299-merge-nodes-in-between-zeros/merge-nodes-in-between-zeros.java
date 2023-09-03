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
    public ListNode mergeNodes(ListNode head) {
        ListNode answer = new ListNode(0);
        ListNode res = answer;
        ListNode curr = head.next;
        int sum = 0;
        while(curr != null){
            if(curr.val == 0){
                ListNode temp = new ListNode(sum);
                sum = 0;
                answer.next = temp;
                answer = answer.next;
            }else{
                sum += curr.val;
            }
             curr = curr.next;
        } 
        return res.next;
    }
}