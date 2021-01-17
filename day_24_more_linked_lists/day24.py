class Node:
    def __init__(self,data):
        self.data = data
        self.next = None


class Solution:
    def insert(self,head,data):
            p = Node(data)
            if head==None:
                head=p
            elif head.next==None:
                head.next=p
            else:
                start=head
                while(start.next!=None):
                    start=start.next
                start.next=p
            return head

    def display(self,head):
        current = head
        while current:
            print(current.data,end=' ')
            current = current.next

    def removeDuplicates(self,head):
        #Write your code here
        if not head:
            return head
        else:
            if head.next is None:
                return head
            elif head.data == head.next.data:
                head.next = head.next.next
                self.removeDuplicates(head)
                return head
            else:
                self.removeDuplicates(head.next)
                return head







mylist= Solution()
l = [1, 2, 2, 2, 3, 3, 4]
head=None
for i in l:
    data=i
    head=mylist.insert(head,data)


head=mylist.removeDuplicates(head)
mylist.display(head);