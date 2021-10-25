a , b = input().split(" ")
a = int(a)
b = int(b)
num = 0
c = 0
for x in range(0,b-1):
    num = num +1
    print(num,end=" ")
    c = c +1
    if c ==a-1:
         print(num+1)
         
         num = num +1
         c = 0
    if num ==b:
        break