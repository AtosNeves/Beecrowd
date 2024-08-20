q = int(input())
soma1 = int(0)
soma2 = int(0)
arr = []
for x in range(1,q+1):
    a, b = input().split(" ")
    a = int(a)
    b = int(b)
    if a < b:
        for x in range(a+1, b):
            if x % 2 !=0:
                soma1 = soma1 + x
                soma1= int(soma1)
        arr.append(soma1)
        soma1=0

    if a > b:
        for v in range(b+1, a):
            if v % 2 !=0:
                soma2 = soma2 + v
                soma2= int(soma2)
        arr.append(soma2)
        soma2=0
    if a == b:
        arr.append(0)

for x in arr:
    print(x)
