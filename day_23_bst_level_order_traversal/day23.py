# Day 23

import sys
from collections import deque

class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data


class Solution:
    def insert(self,root,data):
        if root==None:
            return Node(data)
        else:
            if data<=root.data:
                cur=self.insert(root.left,data)
                root.left=cur
            else:
                cur=self.insert(root.right,data)
                root.right=cur
        return root

    def levelOrder(self,root):
        #Write your code here
        q = deque()
        if root is not None:
            q.append(root)

            while len(q) > 0:
                t = q.popleft()
                print(t.data, end = " ")

                if t.left is not None:
                    q.append(t.left)
                if t.right is not None:
                    q.append(t.right)


myTree=Solution()
root=None
for i in range(6):
    data=int(input())
    root=myTree.insert(root,data)



myTree.levelOrder(root)