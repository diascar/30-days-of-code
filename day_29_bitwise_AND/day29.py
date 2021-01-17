# Day 29



n = 20

k = 3

l = [(i, j) for i in range(1, n+1) for j in range(2, n+1) if i < j]

res = list(map(lambda x: x[0]&x[1], l))
filt = list(filter(lambda x: x < k, res))
sorted(filt)[-1]

for i, j in enumerate(l):
    print(i+1, '\t', f'{j[0]:b}, {j[1]:b}', '\t', res[i])


for i, j in enumerate(l):
    print(i+1, '\t', j, '\t', res[i])



#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    t = int(input())
    

    for t_itr in range(t):
        nk = input().split()

        n = int(nk[0])

        k = int(nk[1])
        
        if k|k -1  <= n:
            print(k - 1)
        else:
            print(k - 2)