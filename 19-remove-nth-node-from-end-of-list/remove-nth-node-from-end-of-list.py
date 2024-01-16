# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, root: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = root
        
        length = 0
        curr = dummy
        while curr:
            length += 1
            curr = curr.next

        
        print(length)
        
        pos = 0
        curr = dummy
        while curr:
            if pos == length - n - 1:
                # print(curr.val, length - n - 1)
                curr.next = curr.next.next
                break
            pos += 1
            curr = curr.next
        
        print(curr.val)
        return dummy.next

        