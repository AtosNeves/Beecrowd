s = float(input())

if s <= 2000:
    print("Isento")

elif 2000.01 <= s <= 3000:
    s1 = s - 2000
    s2 = s1 * 0.08
    print(f"R$ {s2:.2f}")

elif 3000.01 <= s <= 4500:
    a = 1000 * 0.08
    s1 = s - 3000
    s2 = s1 * 0.18
    st = s2 + a
    print(f"R$ {st:.2f}")

elif s > 4500:
    a = 1000 * 0.08
    b = 1500 * 0.18
    s5 = s - 4500
    s6 = s5 * 0.28
    stt = a + b + s6
    print(f"R$ {stt:.2f}")

