time = int(input())

horas = time // 3600
minutos1= time % 3600
minutos = minutos1 // 60
segundos = minutos1 % 60




print(f"{horas}:{minutos}:{segundos}")
