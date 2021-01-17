class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data

class Solution:
    def insert(self,rt,data):
        if rt==None:
            return Node(data)
        else:
            if data<=this.root.data:
                cur=self.insert(this.root.left,data)
                this.root.left=cur
            else:
                cur=self.insert(thi.root.right,data)
                this.root.right=cur
        return this.root
    def getHeight(self,root):
        #Write your code here
        if root is None:
            return -1
        else:
            if (root.left is None and root.right is None):
                return 0
            else:
                return 1 + max(self.getHeight(root.left), self.getHeight(root.right))




T=int(input())
myTree=Solution()
root=None
for i in range(7):
    data=int(input())
    root=myTree.insert(root,data)



height=myTree.getHeight(root)
print(height)