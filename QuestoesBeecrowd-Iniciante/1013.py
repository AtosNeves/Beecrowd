a, b, c = input().split(" ")
a = int(a)
b = int(b)
c = int(c)
maiorab = int(a + b + abs(a-b)) / 2
final = int(maiorab + c + abs(maiorab-c)) / 2
print("{:.0f} eh o maior".format(final))
