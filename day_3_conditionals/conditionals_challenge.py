#integer n

n = int(input())

assert isinstance(n, int) and (n > 0 and n <= 100), 'you must enter an integer from the inclusive interval 0-100'

if n % 2 != 0:
    print('Weird')
else:
    if n >= 2 and n <= 5:
        print('Not Weird')
    elif n >= 6 and n <= 20:
        print('Weird')
    elif n > 20:
        print('Not Weird')

