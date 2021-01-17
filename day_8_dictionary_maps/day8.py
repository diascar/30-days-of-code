# Day 8

n = int(input())

phone_book = {}

for i in range(n):
    contact = input().split()
    phone_book[contact[0]] = contact[1]

q = ' '
queries = []

while q != '':
    try:            
        q = input()
        if q:
            if phone_book.get(q):
                print(f'{q}={phone_book[q]}')
            else:
                print("Not found")
    except EOFError:
        break


# while q != '':
#     q = input()
#     if q: queries.append(q)


# for i in queries:
#     if phone_book.get(i):
#         print(f'{i}={phone_book[i]}')
#     else:
#         print("Not found")

'''
As per the documentation input raises an EOFError when it hits an end-of-file condition. Essentially, input lets you know we are done here there is nothing more to read. You should await for this exception and when you get it just return from your function or terminate the program.
'''