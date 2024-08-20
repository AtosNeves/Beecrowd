a = float(input())
b = float(input())
c = float(input())
d = float(input())
e = float(input())
f = float(input())
i = 0
h = 0
g = 0
arr= [a, b, c, d, e, f]

for x in arr:
    if x >= 0:
        h = h+1
    if x >= 0.0:
        g = g + x
        z = round(g / h, 1)
print(h,"valores positivos")
print(z)
