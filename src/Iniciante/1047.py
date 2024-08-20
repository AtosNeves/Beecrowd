a , b, c , d = input().split(" ")
a = int(a)
b = int(b)
c = int(c)
d = int(d)
h = 0
m = 0
sa = a*3600 + b*60
sb = c*3600 + d*60

if sa < sb:
    d = sb - sa
elif sb < sa:
    d = sa - sb 


if a > c:
    o = (24 - c)*3600
    



print(d)
while d >= 3600:
        h = h+1
        d = d-3600
while d>=60:
        d = d -60
        m = m +1
print("O JOGO DUROU", h, "HORA(S) E",m,"MINUTO(S)")
              
if (a -b)==(c-d):
    print("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")                                