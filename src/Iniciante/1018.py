
valor = int(input())

if 0 < valor < 1000000:
    print(valor)
    r = valor // 100
    print(f"{r} nota(s) de R$ 100,00")
    rr = valor % 100
    rrr= rr // 50
    print(f"{rrr} nota(s) de R$ 50,00")
    rrrr = rr % 50
    r20 = rrrr // 20
    print(f"{r20} nota(s) de R$ 20,00")
    r120 = rrrr % 20
    r10 = r120 // 10
    print(f"{r10} nota(s) de R$ 10,00")
    r55 = r120 % 10
    r5 = r55 // 5
    print(f"{r5} nota(s) de R$ 5,00")
    r22 = r55 % 5
    r2 = r22 // 2
    print(f"{r2} nota(s) de R$ 2,00")
    r11 = r22 % 2
    r1 = r11 // 1
    print(f"{r1} nota(s) de R$ 1,00")
