# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        #if the tree is empty, return an empty list
        if not root:
            return[]


        result = [] # to store the final zigzag travarsal
        queue = deque([root]) #create a deque with the root node as the intial item
        left_to_right = True #Flag to indicate direction left to right to left 


        while queue: # continue as long as there are nodes in the queue
            level_size = len(queue) # calculate the no of node  at the current level
            level_value = [] # to store value of the current level


            for _ in range(level_size): 
                node  = queue.popleft() # deque a node from the left and of the deque


                if left_to_right:
                    level_value.append(node.val) # add the node value to the list left to right
                else:
                    level_value.insert(0,node.val) # add the node value to the beginning right to left


                if node.left:
                    queue.append(node.left) # 
                
                if node.right:
                    queue.append(node.right)


            result.append(level_value) # add the valued of the current level to the result
            left_to_right = not left_to_right # toggle the direction flag for the next level
        return result # return the result
            