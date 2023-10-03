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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode ans = prev;
        ListNode curr = head;
        int count = 1;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
            ListNode temp = new ListNode(gcd(prev.val, curr.val));
            temp.next = curr;
            prev.next = temp;
        }
        return head;
    }

     private int gcd(int num1 , int num2){
        int n = Math.min(num1, num2);
        for(int j = n; j >=0; j--){
            if(num1 % j == 0 && num2 % j == 0){
                return j;
            }
        }
        return -1;
    }
}