z = 100
while z < 200:
    a = int(input())
    if a != 2002:
        print("Senha Invalida")
    if a == 2002:
        print("Acesso Permitido")
        exit()
