z = 100

while z > 10:
    a, b = input().split(" ")
    a = int(a)
    b = int(b)
    if a < b :
        print("Crescente")
    elif b < a:
        print("Decrescente")
    elif a == b:
        exit()
