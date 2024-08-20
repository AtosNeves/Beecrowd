a = []


for x in range(1,5):
    v = int(input())
    v = int(v)
    a.append(v)

print(max(a))
b = a.index(max(a))
print(b+1)
