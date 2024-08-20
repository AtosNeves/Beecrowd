valor = float(input())
print("NOTAS:")
#notas 100
n100 = valor // 100
n100 = round(n100)
print(n100,"nota(s) de R$ 100.00")
#notas 50
n50 = valor - n100*100
n500 = n50 // 50
n500 = round(n500)
print(n500,"nota(s) de R$ 50.00")
#notas 20
n20 = n50 - n500*50
n200 = n20 // 20
n200 = round(n200)
print(n200,"nota(s) de R$ 20.00")
#notas 10
n10 = n20 - n200*20
n1000 = n10 // 10
n1000 = round(n1000)
print(n1000,"nota(s) de R$ 10.00")
#notas 5
n5000 = n10 - n1000*10
n5001 = n5000 // 5
n5001 = round(n5001)
print(n5001,"nota(s) de R$ 5.00")
#notas 2
n2 = n5000 - n5001*5
n22 = n2 // 2
n22 = round(n22)
print(n22,"nota(s) de R$ 2.00")
print("MOEDAS:")
#moedas 1
m1 = n2 - n22*2
m11 = m1 // 1
m11 = round(m11)
print(m11,"moeda(s) de R$ 1.00")
#moedas 0.5
m05 = m1 - m11*1
m005 = m05//0.5
m005 = round(m005)
print(m005,"moeda(s) de R$ 0.50")
#moedas 0.25
m25 = m05 - m005*0.5
m025 = m25 // 0.25
m025 = round(m025)
print(m025,"moeda(s) de R$ 0.25")
#moedas 10
m10 = m25 - m025*0.25
m100 = m10 // 0.10
m100=round(m100)
print(m100,"moeda(s) de R$ 0.10")
#moedas 0.05
m5 = m10 - m100*0.10
m55 = m5 // 0.05
m55=round(m55)
print(m55,"moeda(s) de R$ 0.05")
mfim = m5 - m55*0.05
mfim2 = mfim / 0.01
mfim2 = round(mfim2)
print(mfim2,"moeda(s) de R$ 0.01")
