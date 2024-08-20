q = int(input())
arr = []
v = 0
for x in range(1,q+1):
    v = arr.append(int(input()))
a = arr

for x in a:

    if x % 2 == 0 and x > 0:
        print("EVEN POSITIVE")
    if x % 2 == 0 and x < 0:
        print("EVEN NEGATIVE")
    if x % 2 != 0 and x > 0:
        print("ODD POSITIVE")
    if x % 2 != 0 and x < 0:
        print("ODD NEGATIVE")
    if x ==0:
        print("NULL")
