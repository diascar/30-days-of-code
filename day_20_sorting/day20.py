# Day 20

n = int(input())
a = list(map(int, input().split()))
numSwaps = 0

for j in range(n - 1):
    for i in range(n - 1):
        if a[i] > a[i + 1]:
            a[i], a[i + 1] = a[i + 1], a[i]
            numSwaps += 1

print(f"Array is sorted in {numSwaps} swaps.")
print(f"First Element: {a[0]}")
print(f"Last Element: {a[-1]}")