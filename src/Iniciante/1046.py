a,b = input().split(" ")
a = int(a)
b = int(b)

c = 24-a
d = c + b
if d > 24:
    print(f"O JOGO DUROU",b-a,"HORA(S)")
else:
    print(f"O JOGO DUROU",d,"HORA(S)")
