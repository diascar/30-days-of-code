def toBinaryString(n):
    binString = ''
    if n == 0:
        binString += '0'
        return binString
    elif n == 1:
        binString += '1'
        return binString
    else:
        binString = toBinaryString(n // 2) + str(n % 2) + binString
        return binString


test = [toBinaryString(i) == format(i, "b") for i in range(10000)]
all(test)