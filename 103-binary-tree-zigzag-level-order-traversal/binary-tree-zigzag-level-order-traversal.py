# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
          return []
         
        result = []
        queue = [root]
        LtoR= True
        
        while queue:
            level = []
            queue_size = len(queue)
            
            for _ in range(queue_size):
                node = queue.pop(0)
                level.append(node.val)
                
                if node.left:
                    queue.append(node.left)
                    
                if node.right:
                    queue.append(node.right)    
            if LtoR:
                result.append(level)
            else:
                result.append(level[::-1])
                
            LtoR = not LtoR
        return result

        