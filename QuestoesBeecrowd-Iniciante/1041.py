a,b = input().split(" ")
a = float(a)
b = float(b)

if a > 0 and b > 0:
    print(f"Q1")

elif a < 0 and b >0:
    print(f"Q2")

elif a < 0 and b < 0:
    print(f"Q3")

elif a > 0 and b < 0:
    print(f"Q4")

elif a == 0 and b == 0:
    print(f"Origem")

elif a == 0:
    print(f"Eixo Y")

elif b == 0:
    print(f"Eixo X")
