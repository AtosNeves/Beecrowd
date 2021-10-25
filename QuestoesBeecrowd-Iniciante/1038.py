a,b = input().split(" ")
a = int(a)
b = int(b)
if a == 1:
    total = b * 4.0
    print(f'Total: R$ {total:.2f}')
elif a == 2:
    total2 = b * 4.5
    print(f'Total: R$ {total2:.2f}')
elif a == 3:
    total3 = b * 5.0
    print(f'Total: R$ {total3:.2f}')
elif a == 4:
    total4 = b * 2.0
    print(f'Total: R$ {total4:.2f}')
elif a == 5:
    total5 = b * 1.5
    print(f'Total: R$ {total5:.2f}')
