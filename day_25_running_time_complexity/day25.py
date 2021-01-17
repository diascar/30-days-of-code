T = int(input())

if T < = 30:
    l = [int(input()) for i in range(T)]
else:
    l = [int(input()) for i in range(30)]

def prime(n):
    if n < 2:
        return 'Not prime'
    elif n == 2:
        return 'Prime'
    elif n % 2 == 0:
        return 'Not prime'
    elif n % 3 == 0:
        return 'Not prime'
    
    p = 'Prime'
    for i in range(3, int(n**(1/2)) +1, 2):
        if n % i == 0:
            p = 'Not prime'
            break
    return p


l = [30, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 907]


for i in l:
    print(prime(i))




prime(1000000007)
prime(100000003)

import sys
sys.setrecursionlimit(1500)
print(sys.getrecursionlimit())
prime(1000003)

a = '''
def prime(n):
    if n < 2:
        return 'Not prime'
    elif n == 2:
        return 'Prime'
    elif n % 2 == 0:
        return 'Not prime'
    elif n % 3 == 0:
        return 'Not prime'
    
    p = 'Prime'
    for i in range(3, int(n**(1/2)) +1, 2):
        if n % i == 0:
            p = 'Not prime'
            break
    return p


'''

c = '''
def prime(n):
    if n < 2:
        return 'Not prime'
    elif n == 2:
        return 'Prime'
    
    p = 'Prime'
    for i in range(3, n // 2 +1, 2):
        if n % i == 0:
            p = 'Not prime'
            break
    return p
'''

b = 'prime(1000000007)'

timeit.timeit(stmt = b, setup = a, number = 1)
timeit.timeit(stmt = b, setup = c, number = 1)