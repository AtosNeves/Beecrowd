z = 5
while z > 1:
    x,y = input().split(" ")
    x = int(x)
    y = int(y)
    if x >= 1 and y >= 1:
        print("primeiro")
    elif x >= 1 and y <= -1:
        print("quarto")
    elif x <= -1 and y <= - 1:
        print("terceiro")
    elif x <= -1 and y >= 1:
        print("segundo")
    else:
        exit()
