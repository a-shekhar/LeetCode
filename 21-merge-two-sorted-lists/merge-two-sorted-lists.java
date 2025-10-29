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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode newList = head;
        while(list1 != null && list2 != null){
            int val1 = list1.val;
            int val2 = list2.val;
            
            if(val1 > val2){
                newList.next = list2;
                list2 = list2.next;
                newList = newList.next;
            } else if (val1 <= val2){
                newList.next = list1;
                list1 = list1.next;
                newList = newList.next;
            }
        }

        newList.next = (list1 != null) ? list1 : list2;


        return head.next;
    }
}