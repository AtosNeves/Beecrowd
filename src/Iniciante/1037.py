num = float(input())

if num >= 0 and num <= 25:
    print(f"Intervalo [0,25]")

elif num > 25 and num <= 50:
    print(f"Intervalo (25,50]")

elif num > 50 and num <= 75:
    print(f"Intervalo (50,75]")

elif num > 75 and num <= 100:
    print(f"Intervalo (75,100]")

else:
    print(f"Fora de intervalo")
