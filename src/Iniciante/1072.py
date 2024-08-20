a = int(input())
c1 = 0
c2 = 0

for a in range(1,a+1):
    z = int(input())
    if 10 <= z <= 20:
        c1 = c1 + 1
    else:
        c2 = c2 +1
print(c1, "in")
print(c2, "out")
