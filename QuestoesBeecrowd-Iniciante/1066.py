a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())
p = 0
i = 0
pp = 0
n = 0
arr= [a, b, c, d, e]
for x in arr:
    if x % 2 == 0:
        p = p+1
    if x % 2 != 0:
        i = i +1
    if x > 0:
        pp = pp + 1
    if x < 0:
        n = n +1
print(p,"valor(es) par(es)")
print(i, "valor(es) impar(es)")
print(pp,"valor(es) positivo(s)")
print(n,"valor(es) negativo(s)")
