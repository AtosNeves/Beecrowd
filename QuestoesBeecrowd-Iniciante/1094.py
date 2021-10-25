q = int(input())
coelho = 0
rato = 0
sapo = 0
qcc = 0
qrr = 0
qss = 0
for x in range(1,q+1):

    animal = str(input())

    if "C" in animal:
        c = animal.replace("C","")
        qc = int(c)
        qcc = qcc + qc
    elif "R" in animal:
        r = animal.replace("R","")
        qr = int(r)
        qrr = qrr + qr
    elif "S" in animal:
        s = animal.replace("S","")
        qs = int(s)
        qss = qss + qs
total = qcc + qrr + qss
print("Total:",total,"cobaias")
print("Total de coelhos:",qcc)
print("Total de ratos:",qrr)
print("Total de sapos:", qss)
pc = 100*qcc/total
pr = 100*qrr/total
ps = 100*qss/total
print(f"Percentual de coelhos: {pc:.2f}","%")
print(f"Percentual de ratos: {pr:.2f}","%")
print(f"Percentual de sapos: {ps:.2f}","%")

            
