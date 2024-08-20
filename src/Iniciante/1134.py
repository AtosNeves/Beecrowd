al = int(0)
gas = int(0)
die = int(0)
x = int(0)
while x < 1:
    op = int(input())
    if op == 1:
        al = al + 1
    elif op == 2:
        gas = gas + 1
    elif op == 3:
        die = die + 1
    elif op == 4:
        x = 100
        print("MUITO OBRIGADO")
        print("Alcool:",al)
        print("Gasolina:",gas)
        print("Diesel:",die)
        exit()
    else:
        pass
