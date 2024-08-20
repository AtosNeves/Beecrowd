q = int(input())
p1 = 2
p2 = 3
p3 = 5
contador = 0
arr = []
for x in range(1, q+1):
    nota1, nota2, nota3 = input().split(" ")
    nota1 = float(nota1)
    nota2 = float(nota2)
    nota3 = float(nota3)
    nota1 = float(nota1*2)
    nota2 = float(nota2*3)
    nota3 = float(nota3*5)
    mediap = (nota1+nota2+nota3)/10
    mediap = (f"{mediap:.1f}")
    arr.append(mediap)
z = arr
for x in z:
    print(x)


