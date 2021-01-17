# Day 15


class Node:

    def __init__(self,data):
        self.data = data
        self.next = None


class Solution:
    def display(self, head):
        current = head
        while current:
            print(current.data, end = ' ')
            current = current.next
    pres = None
    def insert(self, head, data):
        n = Node(data)
        if head is None:
            head = n
            return head
        else:
            if head.next is None:
                head.next = n
                Solution.pres = n
                return head
            else:
                Solution.pres.next = n
                Solution.pres = n
                return head







mylist= Solution()




T=4


head=None


for i in range(T):
    data=int(input())
    head=mylist.insert(head,data)



mylist.display(head); 

