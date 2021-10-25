a = int(input())
b = int(input())

if a > b:
    for x in range(b+1,a):
        if x % 5 == 2 or x % 5 == 3:
            print(x)
if a < b:
    for x in range(a+1,b):
        if x % 5 == 2 or x % 5 == 3:
            print(x)
if a == b:
    print("0")
