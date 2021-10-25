total_jogos = 0
vitoria_inter = 0
vitoria_gremio = 0
empate = 0
total = 0
inter = 0
gremio =0
v = 0
j = 0
while j <= 1:
    gi, gg = input().split(" ")
    gg = int(gg)
    gi = int(gi)
    total = total +1
    j = 0
    v = 0
    Q = 0
    if gg > gi:
        vitoria_gremio = vitoria_gremio +1
    elif gi > gg:
        vitoria_inter = vitoria_inter +1
    if gi == gg:
        empate = empate +1
    if vitoria_gremio < vitoria_inter:
        inter = inter +1
    if vitoria_inter < vitoria_gremio:
        gremio= gremio +1
    gg = 0
    gi = 0
    print("Novo grenal (1-sim 2-nao)")
    while v <= 1:
        q = int(input())
        if q == 1:
            v = 2
        elif q ==2:
            print(f"{total} grenais")
            print(f"Inter:{vitoria_inter}")
            print(f"Gremio:{vitoria_gremio}")
            print(f"Empates:{empate}")
            if gremio > inter:
                print("Gremio venceu mais")
            elif inter > gremio:
                print("Inter venceu mais")
            elif inter == gremio:
                print("Nao houve vencedor")
            J = 3
            exit()

