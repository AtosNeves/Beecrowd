a,b,c,d = input().split(" ")
a = float(a)
b = float(b)
c = float(c)
d = float(d)
media = (a*2+b*3+c*4+d*1)/10
if media >= 5 and media <=6.9:
    exame = float(input())
print(f"Media: {media:.1f}")
if media >= 7.0:
    print(f"Aluno aprovado.")

elif media < 5.0:
    print(f"Aluno reprovado.")

elif media >= 5.0 and media <= 6.9:
    print(f"Aluno em exame.")
    media2 = (media + exame)/2
    print(f"Nota do exame: {exame}")
    if media2 >= 5:
        print(f"Aluno aprovado.")
        print(f"Media final: {media2:.1f}")
    if media2 < 5:
        print(f"Aluno rerovado.")
        print(f"Media final: {media2:.1f}")
