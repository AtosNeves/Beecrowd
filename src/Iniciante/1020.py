dias = int(input())

anos = dias // 365
anos1 = dias % 365
mes = anos1 // 30
dia = anos1 % 30

print(f"{anos} ano(s)")
print(f"{mes} mes(es)")
print(f"{dia} dia(s)")
