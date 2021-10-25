a = int(input())
b = int(input())
t = 0
v = 0
if b > a:
    for x in range(a+1, b):
        if x % 2 != 0:
            t = t + x
    print(t)
if a > b:
    for x in range(b +1, a):
        if x % 2 != 0:
            v = v + x
    print(v)
if a == b:
    print(0)
