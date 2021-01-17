# Day 11
if __name__ == '__main__':
    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

def hgSum(A):
    sumList = []
    for i in range(0,len(A) - 2):
        for j in range(0, len(A[0]) - 2):
            a, b, c = A[i][j:j + 3], A[i + 1][j + 1], A[i + 2][j:j + 3]
            sumList.append(sum(a) + b + sum(c))
        j = 0
    return max(sumList)

print(hgSum(arr))