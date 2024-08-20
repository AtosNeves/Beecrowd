s = float(input())

if 0 <= s <= 400.00:
    s15 = s*0.15

    print(f"Novo salario: {s + s15:.2f}")
    print(f"Reajuste ganho: {s15:.2f}")
    print("Em percentual: 15 %")
elif 400.01 <= s <= 800.00:
    s12 = s*0.12
    print(f"Novo salario: {s + s12:.2f}")
    print(f"Reajuste ganho: {s12:.2f}")
    print("Em percentual: 12 %")

elif 800.01 <= s <= 1200.00:
    s10= s*0.10
    print(f"Novo salario: {s + s10:.2f}")
    print(f"Reajuste ganho: {s10:.2f}")
    print("Em percentual: 10 %")

elif 1200.01 <= s <= 2000.00:

    s7 = s*0.07
    print(f"Novo salario: {s + s7:.2f}")
    print(f"Reajuste ganho: {s7:.2f}")
    print("Em percentual: 7 %")

elif s > 2000.00:
    s4 = s*0.04
    print(f"Novo salario: {s + s4:.2f}")
    print(f"Reajuste ganho: {s4:.2f}")
    print("Em percentual: 4 %")
