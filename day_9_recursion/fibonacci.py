# Fibonacci sequence

def fib(n):
    a, b = 0, 1
    if n == 0:
        return a
    elif n == 1:
        return b
    else:
        return fib(n - 1) + fib(n - 2)


