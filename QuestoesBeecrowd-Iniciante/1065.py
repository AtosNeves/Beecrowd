a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())
h = 0
arr = [a, b, c, d, e]

for x in arr:
    if x % 2 == 0:
        h = h +1

print(h,"valores pares")
