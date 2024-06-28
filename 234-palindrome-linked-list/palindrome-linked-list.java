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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversedHalf = reversed(slow);
        slow = head; // reset to head
        while (reversedHalf != null){
            if(reversedHalf.val != slow.val){
                return false;  // Not a palindrome if values are not equal.
            }
            slow = slow.next;
            reversedHalf = reversedHalf.next;
        }
        return true;  // Palindrome if all values are equal.
    }

    public ListNode reversed(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}