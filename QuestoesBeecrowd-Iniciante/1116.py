q = int(input())

for x in range(1,q+1):
    n1,n2 = input().split(" ")
    n1 = int(n1); n2 = int(n2)
    if n2 ==0 :
        print("divisao impossivel")
    else:
        d = n1/n2
        print(f"{d:.1f}")
