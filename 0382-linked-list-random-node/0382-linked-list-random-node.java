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
    ListNode head = null;

    public Solution(ListNode head) {
        this.head = head;
    }
    
    public int getRandom() {

        if(head.next == null){
           return head.val;
       }
      
       Random rand = new Random();
       int count = 0;
       ListNode curr = head;
       while(curr != null){
           count++;
           curr = curr.next;
       } 
       
       int n = rand.nextInt(1, count+1);
      
       int i = 1;
       curr = head;
       while(i < n){
           curr = curr.next;
           i++;
       }
       return curr.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */