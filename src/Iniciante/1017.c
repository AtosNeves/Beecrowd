#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float gasto(int t, int vm)
{
    float g;
    int d = vm * t;
    g = d / 12.0;
    return (g);
}

int main()
{
    setlocale(LC_ALL, "pt-br");

    int a, b;
    float l;
    scanf("%d", &a);
    scanf("%d", &b);
    l = gasto(a, b);
    printf("%.3f\n", l);

    return 0;
}