from collections import deque

class Solution:
    def __init__(self):
        self.stack = deque()
        self.queue = deque()

    def pushCharacter(self, c):
        self.stack.append(c)
    
    def enqueueCharacter(self, c):
        self.queue.append(c)
    
    def popCharacter(self):
        return self.stack.pop()
    
    def dequeueCharacter(self):
        return self.queue.popleft()



s= 'racecar'

obj=Solution()

l=len(s)
# push/enqueue all the characters of string s to stack
for i in range(l):
    obj.pushCharacter(s[i])
    obj.enqueueCharacter(s[i])



isPalindrome=True

for i in range(l // 2):
    if obj.popCharacter()!=obj.dequeueCharacter():
        isPalindrome=False
        break
#finally print whether string s is palindrome or not.
if isPalindrome:
    print("The word, "+s+", is a palindrome.")
else:
    print("The word, "+s+", is not a palindrome.")   