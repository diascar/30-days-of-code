#Day 28

#!/bin/python

import math
import os
import random
import re
import sys

N = 6
names_list = []

for i in ["riya riya@gmail.com","julia julia@julia.me","julia sjulia@gmail.com","julia julia@gmail.com","samantha samantha@gmail.com","tanya tanya@gmail.com","riya ariya@gmail.com","julia bjulia@julia.me","julia csjulia@gmail.com","julia djulia@gmail.com","samantha esamantha@gmail.com","tanya ftanya@gmail.com","riya riya@live.com","julia julia@live.com","julia sjulia@live.com","julia julia@live.com","samantha samantha@live.com","tanya tanya@live.com","riya ariya@live.com","julia bjulia@live.com","julia csjulia@live.com","julia djulia@live.com","samantha esamantha@live.com","tanya ftanya@live.com","riya gmail@riya.com","priya priya@gmail.com","preeti preeti@gmail.com","alice alice@alicegmail.com","alice alice@gmail.com","alice gmail.alice@gmail.com"]:

    firstNameEmailID = i.split()
    firstName = firstNameEmailID[0]
    emailID = firstNameEmailID[1]
    if '@gmail.com' in emailID:
        print(firstName)
        names_list.append(firstName)

for name in sorted(names_list):
    print(name)