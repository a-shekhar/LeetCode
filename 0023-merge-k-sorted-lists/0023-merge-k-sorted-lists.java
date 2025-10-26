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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparing(a -> a.val));
        for(ListNode list : lists){
            ListNode curr = list;
            while(curr != null){
                pq.offer(curr);
                curr = curr.next;
            }
        }

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            temp.next = null;
            tail.next = temp;
            tail = tail.next;
        }

        return dummy.next;
    }
}