z = 0
c = 0
v = 0
x = 0
nota = 0
while x < 3:
    while c <= 1:
        n = float(input())
        if 0 <= n <= 10:
            nota = nota+n
            c = c+1
        else:
            print("nota invalida")
    media = nota / 2
    print(f"media = {media:.2f}")
    media = 0
    nota = 0
    n = 0
    print("novo calculo (1-sim 2-nao)")
    c = 0
    while v <= 1:
        z = int(input())
        if z == 1:
            v = 2
        elif z == 2 :
            x = 3
            exit()
        else:
            print("novo calculo (1-sim 2-nao)")
    v = 0
