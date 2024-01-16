# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None:
            return []
            
        q = deque()
        q.append(root)
        ans = []
        switch = 0
        while q:
            temp_res = []
            for _ in range(len(q)):
                curr = q.popleft()
                temp_res.append(curr.val)

                if curr.left is not None:
                    q.append(curr.left)
                    
                if curr.right is not None:
                    q.append(curr.right)
                    
            if switch == 0:
                ans.append(temp_res)
            else:
                temp_res.reverse()
                ans.append(temp_res)
                
            switch = switch ^ 1
            
        return ans

        