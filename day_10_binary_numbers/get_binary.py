def getBinary(num: int) -> str:
    return "{:b}".format(num)

'''
the "inverse" operation can be obtained using int("binary_string", 2)
'''

def countOnes(num: int) -> None:
    bin_str = getBinary(num)

    lista = []
    acc = 0

    for n in bin_str:
        if n == "1":
            acc += 1
        else:
            lista.append(acc)
            acc = 0
    lista.append(acc)
    print(max(lista))


countOnes(13)
countOnes(125)