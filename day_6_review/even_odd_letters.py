T = int(input())
words = []

for i in range(T):
    words.append(input())


def evenOddLetters(words: list) -> None:
    for word in words:
        odd = ''
        even = ''
        for i, l in enumerate(word):
            if i % 2 == 0:
                even += l
            else:
                odd += l
        print(f'{even} {odd}')

