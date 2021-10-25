a = int(input())
b = 0

for x in range(1, a+1):
    if x % 2 == 0:
        b = x**2
        print(f"{x}^2 = {b}")
