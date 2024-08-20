#para ser triangulo o lado maior tem que ser menor que a soma dos outros lados
a,b,c = input().split(" ")
a = float(a)
b = float(b)
c = float(c)

if (a - b) < c < (a + b) and (b - c) < a < (b + c) and (c-a) < b < (c + a) :
    p = a + b + c
    print(f"Perimetro = {p:.1f}")
else:
    ar=((a+b)*c)/2
    print(f"Area = {ar:.1f}")
