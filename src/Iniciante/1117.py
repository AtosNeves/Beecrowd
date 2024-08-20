z = 0
soma = 0
while z <=1 :
    a = float(input())
    if 0 <= a <=10:
        soma = soma + a
        z = z + 1
    else:
        print("nota invalida")
media = soma /2

print("media =",media)
