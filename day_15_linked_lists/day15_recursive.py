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
        print('\n')

    def insert(self, head, data):
        if head is None:
            head = Node(data)
            return head
        else:
            # print('head interno', head.data)
            if head.next is None:
                head.next = Node(data)
                return head
            else:
                self.insert(head.next, data)
                return head




mylist= Solution()




T=8


head= None


for i in range(T):
    data=int(input())
    head=mylist.insert(head,data)
    print("fora", head.data)



mylist.display(head)