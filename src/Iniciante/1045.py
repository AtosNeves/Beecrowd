a,b,c = input().split(" ")
a = float(a)
b = float(b)
c = float(c)
arr = [a,b,c]
arr.sort()
a = float(arr[2])
b = float(arr[1])
c = float(arr[0])

if a<(b+c) and a > 0 and b >0 and c >0:
    if a**2 == (b**2 + c**2):
        print("TRIANGULO RETANGULO")
    if a**2 > (b**2 + c**2):
        print("TRIANGULO OBTUSANGULO")
    if a**2 < (b**2 + c**2):
        print("TRIANGULO ACUTANGULO")
    if a == b == c:
        print("TRIANGULO EQUILATERO")
    if a > 0 and b > 0 and c > 0 and not a == b == c:
        if a == c:
            print("TRIANGULO ISOSCELES")
        elif b == c:
            print("TRIANGULO ISOSCELES")
        elif a == b:
            print("TRIANGULO ISOSCELES")
else:
#a >= (b + c) or a <= 0 or b <= 0 or c <= 0:
    print("NAO FORMA TRIANGULO")
